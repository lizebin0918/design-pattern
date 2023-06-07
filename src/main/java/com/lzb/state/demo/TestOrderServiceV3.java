package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestOrderServiceV3 {
    private static final Logger LOG = LoggerFactory.getLogger(TestOrderServiceV3.class);

    public static void main(String[] args) {
        LOG.info("第三版代码：催单方法基于状态模式的二次方");
        TestOrderServiceV3 testOrderService = new TestOrderServiceV3();
        testOrderService.testReminder();
    }

    public void testReminder() {
        LOG.info("测试催单方法reminder()");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setID("1");
        orderInfo.setOrderStateEnum(OrderStateEnum.UNPAID);
        IOrderService orderService = new OrderServiceV3();
        //第一次催单
        orderService.reminder(orderInfo);
        //支付
        orderService.pay(orderInfo);
        //第二次催单
        orderService.reminder(orderInfo);
        //发货
        orderInfo.setOrderStateEnum(OrderStateEnum.DELIVERED);
        //第三次催单
        orderService.reminder(orderInfo);
    }
}