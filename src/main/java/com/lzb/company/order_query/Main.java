package com.lzb.company.order_query;

import com.lzb.company.order_query.executor.*;
import com.lzb.company.order_query.new_executor.NewQueryOidCollector;
import com.lzb.company.order_query.new_executor.QueryOidExecutorWrapper;
import com.lzb.company.order_query.query.OrderQuery;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 订单多表拆单表查询<br/>
 * Created on : 2022-03-26 16:18
 *
 * @author lizebin
 */
@Slf4j
public class Main {

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(EXECUTOR_SERVICE::shutdown));
    }

    public static void main(String[] args) {

        List<IQueryOidExecutor> executors = new ArrayList<>();
        executors.add(new QueryOidByAddressExecutor());
        executors.add(new QueryOidByBaseQueryExecutor());
        executors.add(new QueryOidByLogisticsExecutor());
        executors.add(new QueryOidByPackageExecutor());
        executors.add(new QueryOidBySkuCodeExecutor());

        QueryOidCollector collector = new QueryOidCollector(EXECUTOR_SERVICE, executors);

        OrderQuery query = new OrderQuery();

        List<Long> orderIds = collector.listOidForPage(query, 1, 10, "order_date_time", "desc");

        log.info("orderIds {}", orderIds);

        /*---------------------------------------------------*/

        List<QueryOidExecutorWrapper> executorWrappers = new ArrayList<>();
        // 添加多种查询条件
        executorWrappers.add(new QueryOidExecutorWrapper(() -> new QueryOidByAddressExecutor().listOid(query)));

        NewQueryOidCollector newCollector = new NewQueryOidCollector(EXECUTOR_SERVICE, executorWrappers);

        List<Long> orderIds1 = newCollector.listOidForPage(1, 10, "order_date_time", "desc");

        log.info("orderIds1 {}", orderIds1);
    }

}
