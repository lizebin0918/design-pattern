package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeliveredOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(DeliveredOrderStateService.class);

    public DeliveredOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        return reminderStateServiceMap.get(ReminderStateEnum.AFTER_DELIVER.getCode()).reminder(orderInfo);
    }
}