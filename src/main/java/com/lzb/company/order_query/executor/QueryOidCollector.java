package com.lzb.company.order_query.executor;

import com.google.common.collect.Sets;
import com.lzb.company.order_query.query.OrderQuery;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 订单oid查询收集器:执行各个查询，组装数据，最终返回oid结果集<br/>
 * Created on : 2021-12-14 18:07
 *
 * @author lizebin
 */
@Slf4j
@RequiredArgsConstructor
public class QueryOidCollector {

    private final ExecutorService executor;

    private final List<IQueryOidExecutor> queryOidExecutorList;

    /**
     * 分页查询oid
     *
     * @param orderQuery
     * @return
     */
    public List<Long> listOidForPage(OrderQuery orderQuery, int pageIndex, int pageSize, String orderBy, String ascOrDesc) {

        // 内存存储：多维度解析orderQuery，异步查询，返回无序的oid集合
        Set<Long> oidSet = queryOid(orderQuery);

        // 选中了order表的查询，直接拿到排好序的oid
        List<Long> orderedOidList = orderByOid(oidSet, orderBy, ascOrDesc);

        // 选中基础条件，oid已排好序，直接作为参照
        return limitPageSize(orderedOidList, pageIndex, pageSize);

    }

    private Set<Long> queryOid(OrderQuery orderQuery) {
        LinkedBlockingQueue<Set<Long>> oidSetQueue = new LinkedBlockingQueue<>();

        // 多个 executor 异步查询 oid
        queryOidExecutorList.forEach(queryOidExecutor ->
            CompletableFuture
                    .runAsync(() -> oidSetQueue.add(queryOidExecutor.listOid(orderQuery)), executor)
                    .exceptionally(e -> {
                        oidSetQueue.add(Collections.emptySet());
                        return null;}));
        long counter = queryOidExecutorList.size();

        // 实现按执行时间顺序，只要出现空集合，直接返回，不用继续阻塞("fail fast")
        Set<Long> lastOidSet = null;
        while (counter > 0) {
            Set<Long> currentOidSet = null;
            try {
                currentOidSet = oidSetQueue.poll(30, TimeUnit.SECONDS);
            } catch (Exception e) {
                log.error("超时...", e);
                break;
            } finally {
                --counter;
            }

            // 如果为空，不用处理直接返回
            if (CollectionUtils.isEmpty(currentOidSet)) {
                return Collections.emptySet();
            }

            // 设置首元素
            if (Objects.isNull(lastOidSet)) {
                lastOidSet = currentOidSet;
                continue;
            }

            // 交集
            lastOidSet = Sets.intersection(lastOidSet, currentOidSet);
        }

        // 所有条件不命中
        return Objects.nonNull(lastOidSet) ? lastOidSet : Collections.emptySet();
    }

    /**
     * 获取已排序的oid列表
     *
     * @param orderedOidList 已排序的oid
     * @param pageIndex
     * @param pageSize
     * @return
     */
    private static List<Long> limitPageSize(List<Long> orderedOidList, int pageIndex, int pageSize) {
        return orderedOidList.stream()
                .skip((long) (pageIndex - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }

    /**
     * oid排序
     *
     * @param orderedOidList
     * @param orderBy
     * @param orderDirection
     * @return 返回已排序的oid
     */
    private List<Long> orderByOid(Set<Long> oidSet, String orderBy, String orderDirection) {
        return new ArrayList<>(oidSet);
    }

}
