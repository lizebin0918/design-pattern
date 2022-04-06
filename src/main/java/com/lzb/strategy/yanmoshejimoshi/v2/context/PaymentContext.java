package com.lzb.strategy.yanmoshejimoshi.v2.context;

import com.lzb.strategy.yanmoshejimoshi.v2.payment.Payment;
import com.lzb.strategy.yanmoshejimoshi.v2.strategy.PaymentStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 支付上下文<br/>
 * Created on : 2022-04-06 22:23
 *
 * @author cidervisioncase
 */
@Getter
@AllArgsConstructor
public class PaymentContext {

    protected Payment payment;

    public void pay(PaymentStrategy strategy) {
        strategy.pay(this);
    }

}
