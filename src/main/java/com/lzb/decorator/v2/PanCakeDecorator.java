package com.lzb.decorator.v2;
/**
 * 包装类<br/>
 * Created on : 2021-05-15 20:40
 * @author lizebin
 */
public abstract class PanCakeDecorator extends PanCake {

    private final PanCake panCake;

    public PanCakeDecorator(PanCake panCake) {
        this.panCake = panCake;
    }

    @Override
    public String getMsg() {
        return panCake.getMsg();
    }

    @Override
    public int getPrice() {
        return panCake.getPrice();
    }
}
