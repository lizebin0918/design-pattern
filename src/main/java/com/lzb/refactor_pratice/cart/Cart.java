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
        if (shipper.equals("black cat")) {
            return blackCat.calculate(product);
        } else if (shipper.equals("hsinchu")) {
            return hsinchu.calculate(product);
        } else if (shipper.equals("post office")) {
            return postOffice.calculate(product);
        } else {
            throw new IllegalArgumentException("shipper not exist");
        }
    }

}