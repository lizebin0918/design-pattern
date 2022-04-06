package com.lzb.strategy.yanmoshejimoshi.v2.strategy;

import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;

public interface PaymentStrategy<T> {

    /**
     * 支付上下文
     * @param paymentContext
     */
    void pay(PaymentContext<T> paymentContext);

}