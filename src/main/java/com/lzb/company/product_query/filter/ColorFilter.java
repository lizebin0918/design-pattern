package com.lzb.company.product_query.filter;

import com.lzb.company.product_query.Color;
import com.lzb.company.product_query.Product;
import lombok.Getter;

/**
 * <br/>
 * Created on : 2022-06-05 22:49
 *
 * @author lizebin
 */
@Getter
public class ColorFilter extends Filter {

    private Color color;

    public ColorFilter(Color color) {
        this.color = color;
    }

    public boolean isSatisfiedBy(Product product) {
        return product.getColor() == getColor();
    }
}
