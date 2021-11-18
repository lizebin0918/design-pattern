package com.lzb.decorator.v2;
/**
 * 包装类<br/>
 * Created on : 2021-05-15 20:40
 * @author lizebin
 */
public abstract class PanCakeDecorator extends PanCake {

    protected PanCake panCake;

    public PanCakeDecorator(PanCake panCake) {
        this.panCake = panCake;
    }

    @Override
    protected abstract String getMsg();

    @Override
    protected abstract int getPrice();
}
