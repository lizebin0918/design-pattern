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
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 4;
    }
}
