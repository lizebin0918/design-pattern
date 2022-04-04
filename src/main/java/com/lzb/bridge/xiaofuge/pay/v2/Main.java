package com.lzb.bridge.xiaofuge.pay.v2;

import com.lzb.bridge.xiaofuge.pay.v2.paymode.PayFaceMode;
import com.lzb.bridge.xiaofuge.pay.v2.paymode.PayFingerprintMode;

import java.math.BigDecimal;

/**
 * <br/>
 * Created on : 2021-11-16 20:31
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new AliPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }

}
