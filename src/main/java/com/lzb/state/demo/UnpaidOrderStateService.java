package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnpaidOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(UnpaidOrderStateService.class);

    public UnpaidOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean pay(OrderInfo orderInfo) {
        LOG.info("支付成功");
        this.orderService.changeState(orderInfo, OrderStateEnum.PAID);
        return true;
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        LOG.info("删除成功");
        this.orderService.changeState(orderInfo, OrderStateEnum.DELETED);
        return true;
    }
}