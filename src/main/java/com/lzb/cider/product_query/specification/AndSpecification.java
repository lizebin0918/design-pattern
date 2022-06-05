package com.lzb.cider.product_query.specification;

/**
 * <br/>
 * Created on : 2022-06-05 23:17
 *
 * @author lizebin
 */
public class AndSpecification<T> extends CompositeSpecification<T> {

    private ISpecification<T> left, right;

    public AndSpecification(ISpecification<T> left, ISpecification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return left.isSatisfiedBy(o) && right.isSatisfiedBy(o);
    }
}
