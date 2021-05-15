package com.lzb.decorator.v2;

/**
 * <br/>
 * Created on : 2021-05-15 20:57
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        PanCake panCake = new BasePanCake();
        panCake = new EggDecorator(panCake);
        panCake = new EggDecorator(panCake);
        panCake = new SausageDecorator(panCake);
        System.out.println(panCake.getMsg() + ",总价:" + panCake.getPrice());
    }

}
