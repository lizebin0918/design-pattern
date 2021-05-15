package com.lzb.decorator.v1;
/**
 * <br/>
 * Created on : 2021-05-15 20:32
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        PanCake panCake = new PanCake();
        System.out.println(panCake.getMsg() + ",总价:" + panCake.getPrice());

        PanCake panCakeWithEgg = new PanCakeWithEgg();
        System.out.println(panCakeWithEgg.getMsg() + ",总价:" + panCakeWithEgg.getPrice());

        PanCake panCakeWithEggAndSausage = new PanCakeWithEggAndSausage();
        System.out.println(panCakeWithEggAndSausage.getMsg() + ",总价:" + panCakeWithEggAndSausage.getPrice());
    }

}
