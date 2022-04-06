package com.lzb.strategy.yanmoshejimoshi.v2.strategy;

import com.alibaba.fastjson.JSON;
import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CardPayment;

/**
 * 银行卡支付<br/>
 * Created on : 2022-04-06 22:44
 *
 * @author cidervisioncase
 */
public class CardPay implements PaymentStrategy<CardPayment> {

    @Override
    public void pay(PaymentContext<CardPayment> paymentContext) {
        System.out.println("银行卡转账:" + JSON.toJSONString(paymentContext.getPayment()));
    }
}
