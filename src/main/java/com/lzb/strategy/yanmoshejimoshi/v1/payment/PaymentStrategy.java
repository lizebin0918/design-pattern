package com.lzb.strategy.yanmoshejimoshi.v1.payment;


import com.lzb.strategy.yanmoshejimoshi.v1.context.CashPaymentContext;

/**
 * 支付策略<br/>
 * Created on : 2022-04-06 12:26
 *
 * @author lizebin
 */
public interface PaymentStrategy {

    /**
     * 现金支付
     * @param cashPaymentContext
     */
    void pay(CashPaymentContext cashPaymentContext);

}
