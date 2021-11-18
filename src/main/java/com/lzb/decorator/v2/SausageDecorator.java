package com.lzb.decorator.v2;
/**
 * 香肠包装器<br/>
 * Created on : 2021-05-15 20:55
 * @author lizebin
 */
public class SausageDecorator extends PanCakeDecorator {

    public SausageDecorator(PanCake panCake) {
        super(panCake);
    }

    @Override
    public String getMsg() {
        System.out.println("香肠");
        // super调用的是父类的getMsg()，但是通过多态绑定，实际调用的是包装类的getMsg()方法
        return super.getMsg() + "+1根香肠(4块)";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 4;
    }
}
