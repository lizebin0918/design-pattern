package com.lzb.strategy.yanmoshejimoshi.v2.context;

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
public class PaymentContext<T> {

    protected T payment;

    public void doPay(PaymentStrategy<T> strategy) {
        strategy.pay(this);
    }

}
