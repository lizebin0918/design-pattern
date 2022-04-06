package com.lzb.strategy.yanmoshejimoshi.v2;

import com.lzb.strategy.yanmoshejimoshi.v1.payment.card.Card;
import com.lzb.strategy.yanmoshejimoshi.v2.context.CashPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CardPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CashPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.CashPay;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.PaymentStrategy;

/**
 * <br/>
 * Created on : 2022-04-06 22:47
 *
 * @author cidervisioncase
 */
public class Main {

    public static void main(String[] args) {

        // PaymentStrategy rmb = new CashPay();
        // PaymentStrategy dollar = new DollarCash();

        // 给A支付人民币
        PaymentStrategy<CashPayment> rmb = new CashPay<>();
        CashPayment cashPayment = new CashPayment("lizebin", "1", "CNY");
        CashPaymentContext<CashPayment> context = new CashPaymentContext<>(cashPayment);
        rmb.pay(context);

        // 给B支付美金
        // CashPaymentContext peter = new CashPaymentContext("Peter", 1, dollar);
        // peter.doPay();

        // 扩展：通过银行卡号支付
        // Card card = new Card();
        // CardPaymentContext cardPaymentContext = new CardPaymentContext("1234", "lizebin", 1, card);
        // cardPaymentContext.doPay();

    }

}
