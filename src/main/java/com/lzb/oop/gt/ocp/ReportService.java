package com.lzb.oop.gt.ocp;

import java.util.Collections;
import java.util.List;

/**
 * 下面是一个常见的报表服务，首先我们取出当天的订单，然后生成订单的统计报表，还要把统计结果发送给相关的人等：
 * 有一个新需求，把统计信息发给另外一个内部系统，这个内部系统可以把统计信息展示出来，供外部合作伙伴查阅。该怎么做呢？
 */
class ReportService {

    public void processV1() {
        // 获取当天的订单
        List<Order> orders = fetchDailyOrders();
        // 生成统计信息
        OrderStatistics statistics = generateOrderStatistics(orders);

        /*--------------------统计信息会分发到不同的系统-----------------*/
        // 生成统计报表
        generateStatisticsReport(statistics);
        // 发送统计邮件
        sendStatisticsByMail(statistics);
    }

    /**
     * 依赖 Spring 注入
     */
    private List<OrderStatisticsConsumer> consumers;
    public void processV2() {
        // 获取当天的订单
        List<Order> orders = fetchDailyOrders();
        // 生成统计信息
        OrderStatistics statistics = generateOrderStatistics(orders);

        // 后两步和即将添加的步骤有一个共同点，都使用了统计信息，这样我们就找到了它们的共性，所以，我们就可以用一个共同的模型去涵盖它们
        for (OrderStatisticsConsumer consumer : consumers) {
            consumer.consume(statistics);
        }
    }

    private void sendStatisticsByMail(OrderStatistics statistics) {

    }

    private void generateStatisticsReport(OrderStatistics statistics) {

    }

    private OrderStatistics generateOrderStatistics(List<Order> orders) {
        return null;
    }

    private List<Order> fetchDailyOrders() {
        return Collections.emptyList();
    }

    private static class Order {

    }

    private static class OrderStatistics {

    }

    private interface OrderStatisticsConsumer {
        void consume(OrderStatistics statistics);
    }

    class StatisticsReporter implements OrderStatisticsConsumer {
        public void consume(OrderStatistics statistics) {
            generateStatisticsReport(statistics);
        }
    }

    class StatisticsByMailer implements OrderStatisticsConsumer {
        public void consume(OrderStatistics statistics) {
            sendStatisticsByMail(statistics);
        }
    }
}