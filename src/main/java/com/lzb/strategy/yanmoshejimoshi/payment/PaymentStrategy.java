package com.lzb.strategy.yanmoshejimoshi.payment;

import com.lzb.strategy.yanmoshejimoshi.context.CardPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.context.CashPaymentContext;

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
