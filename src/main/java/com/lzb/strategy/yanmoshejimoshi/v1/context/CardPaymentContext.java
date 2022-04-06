package com.lzb.strategy.yanmoshejimoshi.v1.context;

import com.lzb.strategy.yanmoshejimoshi.v1.payment.PaymentStrategy;
import lombok.Getter;

/**
 * 银行卡支付<br/>
 * Created on : 2022-04-06 13:39
 *
 * @author lizebin
 */
@Getter
public class CardPaymentContext extends CashPaymentContext {

    /**
     * 转账卡号
     */
    private final String cardNo;

    public CardPaymentContext(String cardNo, String userName, double money, PaymentStrategy strategy) {
        super(userName, money, strategy);
        this.cardNo = cardNo;
    }
}
