package com.lzb.refactor.cart;

public class BlackCat implements ShippingFee {

    @Override
    public double calculate(Product product) {
        if (product.getWeight() > 20) {
            return 500;
        } else {
            return 100 + product.getWeight() * 10;
        }
    }
}