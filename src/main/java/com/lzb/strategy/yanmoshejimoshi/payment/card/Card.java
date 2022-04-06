package com.lzb.strategy.yanmoshejimoshi.payment.card;

import com.lzb.strategy.yanmoshejimoshi.context.CardPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.context.CashPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.payment.PaymentStrategy;

/**
 * 银行卡支付<br/>
 * Created on : 2022-04-06 13:41
 *
 * @author lizebin
 */
public class Card implements PaymentStrategy {

    @Override
    public void pay(CashPaymentContext cashPaymentContext) {
        CardPaymentContext cardPaymentContext = (CardPaymentContext) cashPaymentContext;
        System.out.println("现在给卡号：" + cardPaymentContext.getCardNo() + "，转账：" + cardPaymentContext.getMoney());
    }
}
