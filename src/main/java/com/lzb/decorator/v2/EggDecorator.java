package com.lzb.decorator.v2;
/**
 * 鸡蛋装饰器<br/>
 * Created on : 2021-05-15 20:53
 * @author lizebin
 */
public class EggDecorator extends PanCakeDecorator {

    public EggDecorator(PanCake panCake) {
        super(panCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
