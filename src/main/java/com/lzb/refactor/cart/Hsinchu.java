package com.lzb.refactor.cart;

public class Hsinchu implements ShippingFee {

    @Override
    public double calculate(Product product) {
        double size = getSize(product);
        if (product.getLength() > 100 || product.getWidth() > 100 || product.getHeight() > 100) {
            return size * 0.00002 * 1100 + 500;
        } else {
            return size * 0.00002 * 1200;
        }
    }
}