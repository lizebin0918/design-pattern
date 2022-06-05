package com.lzb.cider.product_query.specification;

/**
 * <br/>
 * Created on : 2022-06-05 23:22
 *
 * @author lizebin
 */
public class NotSpecification<T> extends CompositeSpecification<T> {

    private ISpecification<T> specification;

    public NotSpecification(ISpecification<T> specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return !specification.isSatisfiedBy(o);
    }
}
