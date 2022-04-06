package com.lzb.strategy.yanmoshejimoshi.v2.context;

import com.lzb.strategy.yanmoshejimoshi.v2.payment.CashPayment;

/**
 * 现金支付支付<br/>
 * Created on : 2022-04-06 22:26
 *
 * @author cidervisioncase
 */
public class CashPaymentContext<CashPayment> extends PaymentContext<CashPayment> {

    public CashPaymentContext(CashPayment payment) {
        super(payment);
    }

}
