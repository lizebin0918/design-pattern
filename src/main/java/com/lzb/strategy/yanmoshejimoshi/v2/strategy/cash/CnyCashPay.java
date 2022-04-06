package com.lzb.strategy.yanmoshejimoshi.v2.strategy.cash;

import com.alibaba.fastjson.JSON;
import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CashPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.PaymentStrategy;

/**
 * (人民币)现金支付<br/>
 * Created on : 2022-04-06 22:39
 *
 * @author cidervisioncase
 */
public class CnyCashPay implements PaymentStrategy<CashPayment> {

    @Override
    public void pay(PaymentContext<CashPayment> paymentContext) {

        CashPayment payment = (CashPayment) paymentContext.getPayment();

        System.out.println("人民币现金支付:" + JSON.toJSONString(payment));

    }

}
