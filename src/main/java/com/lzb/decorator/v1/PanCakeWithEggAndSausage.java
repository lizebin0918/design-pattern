package com.lzb.decorator.v1;
/**
 * 加鸡蛋、香肠<br/>
 * Created on : 2021-05-15 20:30
 * @author lizebin
 */
public class PanCakeWithEggAndSausage extends PanCakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 4;
    }
}
