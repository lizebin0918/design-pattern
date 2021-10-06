package com.lzb.state.head_first.v2;

public interface State {

    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 扭动转柄
     */
    void turnCrank();

    /**
     * 发糖
     */
    void dispense();
}