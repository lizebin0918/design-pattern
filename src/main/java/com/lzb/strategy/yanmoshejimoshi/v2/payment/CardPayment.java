package com.lzb.strategy.yanmoshejimoshi.v2.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 卡支付<br/>
 * Created on : 2022-04-06 22:27
 *
 * @author cidervisioncase
 */
@Getter
@AllArgsConstructor
public class CardPayment {

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 转款方
     */
    private String fromUser;

    /**
     * 收款方
     */
    private String toUser;

    /**
     * 支付金额（分）
     */
    private String money;

}
