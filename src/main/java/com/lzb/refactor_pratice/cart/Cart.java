package com.lzb.refactor_pratice.cart;

/**
 * 购物车
 * @author lizebin
 */
public class Cart {
    public double shippingFee(String shipper, Product product) {
        if (shipper.equals("black cat")) {
            if (product.getWeight() > 20) {
                return 500;
            } else {
                return 100 + product.getWeight() * 10;
            }
        } else if (shipper.equals("hsinchu")) {
            double size = product.getLength() * product.getWidth() * product.getHeight();
            if (product.getLength() > 100 || product.getWidth() > 100 || product.getHeight() > 100) {
                return size * 0.00002 * 1100 + 500;
            } else {
                return size * 0.00002 * 1200;
            }
        } else if (shipper.equals("post office")) {
            double feeByWeight = 80 + product.getWeight() * 10;
            double size = product.getLength() * product.getWidth() * product.getHeight();
            double feeBySize = size * 0.00002 * 1100;
            return Math.min(feeByWeight, feeBySize);
        } else {
            throw new IllegalArgumentException("shipper not exist");
        }
    }
}