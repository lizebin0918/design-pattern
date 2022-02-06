package com.lzb.pricinple.lsp.v2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 模拟储蓄卡功能
 */
@Slf4j
public class CashCard extends BankCard {

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        // 模拟支付成功
        log.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    public String recharge(String orderId, BigDecimal amount) {
        // 模拟充值成功
        log.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    /**
     * 风险校验
     *
     * @param cardNo  卡号
     * @param orderId 单号
     * @param amount  金额
     * @return 状态
     */
    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        // 模拟风控校验
        log.info("风控校验，卡号：{} 单号：{} 金额：{}", cardNo, orderId, amount);
        return true;
    }

}
