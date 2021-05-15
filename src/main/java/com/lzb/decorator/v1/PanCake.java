package com.lzb.decorator.v1;
/**
 * <br/>
 * Created on : 2021-05-15 20:24
 * @author lizebin
 */
public class PanCake {

    /**
     * 具体名称
     * @return
     */
    protected String getMsg() {
        return "煎饼";
    }

    /**
     * 价格
     * @return
     */
    protected int getPrice() {
        return 5;
    }

}
