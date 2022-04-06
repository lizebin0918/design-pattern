package com.lzb.strategy.yanmoshejimoshi.v2.strategy;

import com.alibaba.fastjson.JSON;
import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CashPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.Payment;

/**
 * 现金支付<br/>
 * Created on : 2022-04-06 22:39
 *
 * @author cidervisioncase
 */
public class CashPay implements PaymentStrategy {

    @Override
    public void pay(PaymentContext paymentContext) {

        CashPayment payment = (CashPayment) paymentContext.getPayment();

        System.out.println("现金支付:" + JSON.toJSONString(payment));

    }

}
