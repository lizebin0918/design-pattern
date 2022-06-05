package com.lzb.cider.product_query.filter;

import com.lzb.cider.product_query.Product;

/**
 * <br/>
 * Created on : 2022-06-05 23:05
 *
 * @author lizebin
 */
public class NotFilter extends Filter {

    private Filter filterToNegate;

    public NotFilter(Filter filterToNegate) {
        this.filterToNegate = filterToNegate;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return !filterToNegate.isSatisfiedBy(product);
    }

}
