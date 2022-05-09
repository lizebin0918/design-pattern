package com.lzb.decorator.demo3;

/**
 * <br/>
 * Created on : 2022-05-09 17:28
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        CancelOrder order = new ThirtyPartyBOrder(new ThirtyPartyAOrder(new ErpOrder(1), 2L), 3L);
        order.cancel("order cancel", "");
    }

}
