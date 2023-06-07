package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeDeliverReminderStateService implements IReminderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(BeforeDeliverReminderStateService.class);
    private final IOrderService orderService;

    public BeforeDeliverReminderStateService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        //此处省略几百行业务代码
        LOG.info("发货前催单成功");
        return true;
    }
}
