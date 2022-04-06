package com.lzb.strategy.yanmoshejimoshi.v2.context;

import com.lzb.strategy.yanmoshejimoshi.v2.payment.CardPayment;

/**
 * 银行卡支付<br/>
 * Created on : 2022-04-06 22:26
 *
 * @author cidervisioncase
 */
public class CardPaymentContext<CardPayment> extends PaymentContext<CardPayment> {

    public CardPaymentContext(CardPayment payment) {
        super(payment);
    }

}
