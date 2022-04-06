package com.lzb.strategy.yanmoshejimoshi.v2.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <br/>
 * Created on : 2022-04-06 22:30
 *
 * @author cidervisioncase
 */
@Getter
@AllArgsConstructor
public class CashPayment {

    /**
     * 收款方
     */
    private String toUser;

    /**
     * 支付金额（分）
     */
    private String money;

    /**
     * 币种
     */
    private String currency;

}
