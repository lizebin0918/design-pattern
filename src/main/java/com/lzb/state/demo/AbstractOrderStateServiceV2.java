package com.lzb.state.demo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractOrderStateServiceV2 implements IOrderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractOrderStateServiceV2.class);
    protected Map<Integer, IReminderStateService> reminderStateServiceMap = new HashMap<>();
    protected IOrderService orderService;

    public AbstractOrderStateServiceV2(IOrderService orderService) {
        this.orderService = orderService;
        reminderStateServiceMap.put(ReminderStateEnum.BEFORE_DELIVER.getCode(), new BeforeDeliverReminderStateService(this.orderService));
        reminderStateServiceMap.put(ReminderStateEnum.AFTER_DELIVER.getCode(), new AfterDeliverReminderStateService(this.orderService));
    }

    @Override
    public boolean pay(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法支付", orderInfo.getOrderStateEnum().getName());
        return false;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法催单", orderInfo.getOrderStateEnum().getName());
        return false;
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法删除", orderInfo.getOrderStateEnum().getName());
        return false;
    }

}
