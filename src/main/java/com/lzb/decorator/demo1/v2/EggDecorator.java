package com.lzb.decorator.demo1.v2;
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
    public String getMsg() {
        System.out.println("鸡蛋");
        // super调用的是父类getMsg()，但是通过多态绑定，实际调用的是当前的getMsg()方法
        return super.getMsg() + "+1个鸡蛋(2块)";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
