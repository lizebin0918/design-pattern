package com.lzb.decorator.v2;

/**
 * <br/>
 * Created on : 2021-05-15 20:24
 * @author lizebin
 */
public abstract class PanCake {

    /**
     * 具体名称
     * @return
     */
    protected abstract String getMsg();

    /**
     * 价格
     * @return
     */
    protected abstract int getPrice();

}