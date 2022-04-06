package com.lzb.strategy.yanmoshejimoshi.v2.context;

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
public abstract class PaymentContext<T> {

    protected T payment;

}
