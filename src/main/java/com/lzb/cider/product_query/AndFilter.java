package com.lzb.cider.product_query;

/**
 * <br/>
 * Created on : 2022-06-05 22:58
 *
 * @author lizebin
 */
public class AndFilter extends Filter {

    private Filter augend, addend;

    public AndFilter(Filter augend, Filter addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return augend.isSatisfiedBy(product) && addend.isSatisfiedBy(product);
    }
}
