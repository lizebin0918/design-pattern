package com.lzb.decorator.demo3;

/**
 * erp订单<br/>
 * Created on : 2022-05-09 17:21
 *
 * @author lizebin
 */
public class ErpOrder implements CancelOrder {

    private final long orderId;

    public ErpOrder(long orderId) {
        this.orderId = orderId;
    }

    @Override
    public void cancel(String remark, String operatorId) {
        System.out.println("erp订单取消,订单号:" + orderId);
    }

}
