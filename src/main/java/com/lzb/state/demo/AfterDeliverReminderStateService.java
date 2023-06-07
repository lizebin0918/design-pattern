package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfterDeliverReminderStateService implements IReminderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(AfterDeliverReminderStateService.class);
    private final IOrderService orderService;

    public AfterDeliverReminderStateService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        //此处省略几百行业务代码
        LOG.info("发货后催单成功");
        return true;
    }
}
