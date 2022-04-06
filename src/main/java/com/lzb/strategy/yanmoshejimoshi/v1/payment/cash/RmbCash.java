package com.lzb.strategy.yanmoshejimoshi.v1.payment.cash;

import com.lzb.strategy.yanmoshejimoshi.v1.context.CashPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v1.payment.PaymentStrategy;

/**
 * 人民币支付<br/>
 * Created on : 2022-04-06 12:27
 *
 * @author lizebin
 */
public class RmbCash implements PaymentStrategy {

    @Override
    public void pay(CashPaymentContext cashPaymentContext) {
        System.out.println("现在给" + cashPaymentContext.getUserName() + "支付人民币(元)" + cashPaymentContext.getMoney());
    }
}
