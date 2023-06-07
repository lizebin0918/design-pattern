package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaidOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(PaidOrderStateService.class);

    public PaidOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        return reminderStateServiceMap.get(ReminderStateEnum.BEFORE_DELIVER.getCode()).reminder(orderInfo);
    }
}