package com.lzb.decorator.demo3;

/**
 * 第三方A订单<br/>
 * Created on : 2022-05-09 17:25
 *
 * @author lizebin
 */
public class ThirtyPartyAOrder implements CancelOrder {

    private CancelOrder order;

    private long thirtyPartyAOrderId;

    private ThirtyPartyAOrder() {}

    public ThirtyPartyAOrder(CancelOrder order, long thirtyPartyAOrderId) {
        this.order = order;
        this.thirtyPartyAOrderId = thirtyPartyAOrderId;
    }

    @Override
    public void cancel(String remark, String operatorId) {
        System.out.println("thirty party A cancal，订单号:" + thirtyPartyAOrderId);
        order.cancel(remark, operatorId);
    }
}
