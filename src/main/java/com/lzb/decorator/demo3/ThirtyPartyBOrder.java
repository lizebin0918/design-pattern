package com.lzb.decorator.demo3;

/**
 * 第三方B订单<br/>
 * Created on : 2022-05-09 17:25
 *
 * @author lizebin
 */
public class ThirtyPartyBOrder implements CancelOrder {

    private CancelOrder order;

    private long thirtyPartyBOrderId;

    private ThirtyPartyBOrder() {}

    public ThirtyPartyBOrder(CancelOrder order, long thirtyPartyBOrderId) {
        this.order = order;
        this.thirtyPartyBOrderId = thirtyPartyBOrderId;
    }

    @Override
    public void cancel(String remark, String operatorId) {
        System.out.println("thirty party B cancal，订单号:" + thirtyPartyBOrderId);
        order.cancel(remark, operatorId);
    }
}
