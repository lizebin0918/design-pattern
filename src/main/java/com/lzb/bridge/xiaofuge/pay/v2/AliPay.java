package com.lzb.bridge.xiaofuge.pay.v2;

import com.lzb.bridge.xiaofuge.pay.v2.paymode.IPayMode;

import java.math.BigDecimal;

public class AliPay extends Pay {

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.printf("模拟支付宝渠道支付划账开始。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        System.out.printf("模拟支付宝渠道支付风控校验。uId：%s tradeId：%s security：%s", uId, tradeId, security);
        if (!security) {
            System.out.printf("模拟支付宝渠道支付划账拦截。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
            return "0001";
        }
        System.out.printf("模拟支付宝渠道支付划账成功。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
        return "0000";
    }

}