package com.lzb.decorator.v1;
/**
 * 加了鸡蛋的煎饼<br/>
 * Created on : 2021-05-15 20:26
 * @author lizebin
 */
public class PanCakeWithEgg extends PanCake {

    /**
     * 加鸡蛋
     * @return
     */
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    /**
     * 加了个鸡蛋2块
     * @return
     */
    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
