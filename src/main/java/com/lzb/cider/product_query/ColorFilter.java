package com.lzb.cider.product_query;

import lombok.Getter;

/**
 * <br/>
 * Created on : 2022-06-05 22:49
 *
 * @author lizebin
 */
@Getter
public class ColorFilter {

    private Color color;

    public ColorFilter(Color color) {
        this.color = color;
    }

    boolean isSatisfiedBy(Product product) {
        return product.getColor() == getColor();
    }
}
