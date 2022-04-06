package com.lzb.strategy.yanmoshejimoshi.v2;

import com.lzb.strategy.yanmoshejimoshi.v2.context.PaymentContext;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CardPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.payment.CashPayment;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.card.CardPay;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.cash.CnyCashPay;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.PaymentStrategy;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.cash.DollarCashPay;

/**
 * 这里的现金支付和卡号支付，并不是平行（可替代）关系，因为两个策略的入参不一样。类比多个排序算法，可以针对不同类型<br/>
 * 但是人民币和美金支付是相同的策略
 * Created on : 2022-04-06 22:47
 *
 * @author cidervisioncase
 */
public class Main {

    public static void main(String[] args) {

        // 给A支付人民币
        CashPayment cashPayment = new CashPayment("lizebin", "1");
        PaymentContext<CashPayment> cashContext = new PaymentContext<>(cashPayment);
        // 人民币支付
        cashContext.pay(new CnyCashPay());
        // 美金支付
        cashContext.pay(new DollarCashPay());

        // 扩展：通过银行卡号支付
        PaymentStrategy<CardPayment> cardPay = new CardPay();
        CardPayment cardPayment = new CardPayment("卡号", "lizebin", "1", "CNY");
        PaymentContext<CardPayment> cardContext = new PaymentContext<>(cardPayment);
        // 类型有误
        // cardContext.pay(cashPay);
        cardContext.pay(cardPay);

    }

}
