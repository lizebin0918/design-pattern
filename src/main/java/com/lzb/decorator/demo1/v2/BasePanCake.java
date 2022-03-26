package com.lzb.decorator.demo1.v2;

/**
 *
 */
public class BasePanCake extends PanCake {

    /**
     * 具体名称
     * @return
     */
    protected String getMsg() {
        return "煎饼(5块)";
    }

    /**
     * 价格
     * @return
     */
    protected int getPrice() {
        return 5;
    }

}
