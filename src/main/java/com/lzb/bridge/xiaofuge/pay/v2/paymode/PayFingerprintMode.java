package com.lzb.bridge.xiaofuge.pay.v2.paymode;

public class PayFingerprintMode implements IPayMode{

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付，风控校验指纹信息");
        return true;
    }

}