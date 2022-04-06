package com.lzb.strategy.yanmoshejimoshi.v2.strategy;

import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.Payment;

public interface PaymentStrategy {

    /**
     * 支付上下文
     * @param paymentContext
     */
    void pay(PaymentContext paymentContext);

}