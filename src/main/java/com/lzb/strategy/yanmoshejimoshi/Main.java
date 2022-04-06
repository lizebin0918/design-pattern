package com.lzb.strategy.yanmoshejimoshi;

import com.lzb.strategy.yanmoshejimoshi.context.CardPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.context.CashPaymentContext;
import com.lzb.strategy.yanmoshejimoshi.payment.card.Card;
import com.lzb.strategy.yanmoshejimoshi.payment.cash.DollarCash;
import com.lzb.strategy.yanmoshejimoshi.payment.PaymentStrategy;
import com.lzb.strategy.yanmoshejimoshi.payment.cash.RmbCash;

/**
 * <br/>
 * Created on : 2022-04-06 12:30
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        PaymentStrategy rmb = new RmbCash();
        PaymentStrategy dollar = new DollarCash();

        // 给A支付人民币
        CashPaymentContext lizebin = new CashPaymentContext("lizebin", 1, rmb);
        lizebin.doPay();

        // 给B支付美金
        CashPaymentContext peter = new CashPaymentContext("Peter", 1, dollar);
        peter.doPay();

        // 扩展：通过银行卡号支付
        Card card = new Card();
        CardPaymentContext cardPaymentContext = new CardPaymentContext("1234", "lizebin", 1, card);
        cardPaymentContext.doPay();

    }

}
