package com.lzb.strategy.yanmoshejimoshi.payment.cash;

import com.lzb.strategy.yanmoshejimoshi.context.CashPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.payment.PaymentStrategy;

/**
 * 美金支付<br/>
 * Created on : 2022-04-06 12:29
 *
 * @author lizebin
 */
public class DollarCash implements PaymentStrategy {

    @Override
    public void pay(CashPaymentContext cashPaymentContext) {
        System.out.println("现在给" + cashPaymentContext.getUserName() + "支付美金($)" + cashPaymentContext.getMoney());
    }

}
