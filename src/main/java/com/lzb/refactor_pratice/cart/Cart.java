package com.lzb.refactor_pratice.cart;

/**
 * 购物车
 * @author lizebin
 */
public class Cart {

    private final BlackCat blackCat = new BlackCat();
    private final Hsinchu hsinchu = new Hsinchu();
    private final PostOffice postOffice = new PostOffice();

    public double shippingFee(String shipper, Product product) {
        ShippingFee shippingFee;
        if (shipper.equals("black cat")) {
            shippingFee = blackCat;
        } else if (shipper.equals("hsinchu")) {
            shippingFee = hsinchu;
        } else if (shipper.equals("post office")) {
            shippingFee = postOffice;
        } else {
            throw new IllegalArgumentException("shipper not exist");
        }
        return shippingFee.calculate(product);
    }

}