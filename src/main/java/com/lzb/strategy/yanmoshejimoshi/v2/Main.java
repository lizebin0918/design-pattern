package com.lzb.strategy.yanmoshejimoshi.v2;

import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CardPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CashPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.CardPay;
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
        PaymentStrategy<CashPayment> cashPay = new CashPay<>();
        CashPayment cashPayment = new CashPayment("lizebin", "1", "CNY");
        PaymentContext<CashPayment> context = new PaymentContext<>(cashPayment);
        context.doPay(cashPay);

        // 给B支付美金
        // CashPaymentContext peter = new CashPaymentContext("Peter", 1, dollar);
        // peter.doPay();

        // 扩展：通过银行卡号支付
        PaymentStrategy<CardPayment> cardPay = new CardPay();
        CardPayment cardPayment = new CardPayment("卡号", "lizebin", "1", "CNY");
        PaymentContext<CardPayment> cardContext = new PaymentContext<>(cardPayment);
        cardContext.doPay(cardPay);

    }

}
