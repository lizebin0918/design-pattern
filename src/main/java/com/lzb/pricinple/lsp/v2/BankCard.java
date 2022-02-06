package com.lzb.pricinple.lsp.v2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 银行卡
 */
@Slf4j
public abstract class BankCard {

    private String cardNo;   // 卡号
    private String cardDate; // 开卡时间

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    // 正向入账，+ 钱
    public String positive(String orderId, BigDecimal amount) {
        // 入款成功，存款、还款
        log.info("卡号{} 入款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    // 逆向入账，- 钱
    public String negative(String orderId, BigDecimal amount) {
        // 入款成功，存款、还款
        log.info("卡号{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 交易流水查询
     *
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        log.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<String>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return tradeList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }
}
