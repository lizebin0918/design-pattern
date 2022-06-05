package com.lzb.cider.product_query.filter;

import com.lzb.cider.product_query.Product;

/**
 * <br/>
 * Created on : 2022-06-05 22:53
 *
 * @author lizebin
 */
public abstract class Filter {

    public abstract boolean isSatisfiedBy(Product product);

}
