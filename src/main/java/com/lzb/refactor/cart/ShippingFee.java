package com.lzb.refactor.cart;

public interface ShippingFee {

    default double getSize(Product product) {
        return product.getLength() * product.getWidth() * product.getHeight();
    }

    /**
     * 计算运费
     *
     * @param product
     * @return
     */
    double calculate(Product product);

}