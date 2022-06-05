package com.lzb.cider.product_query.filter;

import com.lzb.cider.product_query.Product;
import com.lzb.cider.product_query.Range;

/**
 * <br/>
 * Created on : 2022-06-05 22:55
 *
 * @author lizebin
 */
public class PriceRangeFilter extends Filter {

    private Range range;

    public PriceRangeFilter(Range range) {
        this.range = range;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return range.between(product.getPrice());
    }
}
