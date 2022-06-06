package com.lzb.refactor.cart;

public class PostOffice implements ShippingFee {

    @Override
    public double calculate(Product product) {
        double feeByWeight = 80 + product.getWeight() * 10;
        double size = getSize(product);
        double feeBySize = size * 0.00002 * 1100;
        return Math.min(feeByWeight, feeBySize);

    }
}