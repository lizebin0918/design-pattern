package com.lzb.bridge.pay.v1;


import java.math.BigDecimal;

public class PayController {

    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType) {
        // 微信支付
        if (1 == channelType) {
            System.out.printf("模拟微信渠道支付划账开始。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
            if (1 == modeType) {
                System.out.println("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                System.out.println("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                System.out.println("指纹支付，风控校验指纹信息");
            }
        }
        // 支付宝支付
        else if (2 == channelType) {
            System.out.printf("模拟支付宝渠道支付划账开始。uId：%s tradeId：%s amount：%s", uId, tradeId, amount);
            if (1 == modeType) {
                System.out.println("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                System.out.println("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                System.out.println("指纹支付，风控校验指纹信息");
            }
        }
        return true;
    }

}