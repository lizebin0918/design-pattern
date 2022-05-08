package com.lzb.refactor_pratice.cart;

import java.util.Map;

/**
 * 购物车
 * @author lizebin
 */
public class Cart {

    public static final String BLACK_CAT = "black cat";
    public static final String HSINCHU = "hsinchu";
    public static final String POST_OFFICE = "post office";

    private final Map<String, ShippingFee> shippingFees = Map.of(
        BLACK_CAT, new BlackCat(),
        HSINCHU, new Hsinchu(),
        POST_OFFICE, new PostOffice()
    );

    public double shippingFee(String shipper, Product product) {
        return shippingFees.get(shipper).calculate(product);
    }

}