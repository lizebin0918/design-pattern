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
    protected String getMsg() {
        System.out.println("香肠");
        return panCake.getMsg() + "+1根香肠(4块)";
    }

    @Override
    protected int getPrice() {
        return panCake.getPrice() + 4;
    }
}
