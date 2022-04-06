package com.lzb.strategy.yanmoshejimoshi.context;

import com.lzb.strategy.yanmoshejimoshi.payment.PaymentStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 支付上下文<br/>
 * Created on : 2022-04-06 12:23
 *
 * @author lizebin
 */
@Getter
@AllArgsConstructor
public class CashPaymentContext {

    private String userName;

    private double money = 0.0;

    private PaymentStrategy strategy;

    public void doPay() {
        this.strategy.pay(this);
    }

}
