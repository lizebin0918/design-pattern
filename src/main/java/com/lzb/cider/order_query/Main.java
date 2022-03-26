package com.lzb.cider.order_query;

import com.lzb.cider.order_query.executor.*;
import com.lzb.cider.order_query.query.OrderQuery;
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
    }

}
