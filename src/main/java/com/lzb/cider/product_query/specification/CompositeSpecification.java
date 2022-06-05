package com.lzb.cider.product_query.specification;

/**
 * <br/>
 * Created on : 2022-06-05 23:14
 *
 * @author lizebin
 */
public abstract class CompositeSpecification<T> implements ISpecification<T> {

    @Override
    public ISpecification<T> and(ISpecification<T> s) {
        return new AndSpecification<>(this, s);
    }

    @Override
    public ISpecification<T> or(ISpecification<T> s) {
        return new OrSpecification<>(this, s);
    }

    @Override
    public ISpecification<T> not(ISpecification<T> s) {
        return new NotSpecification<>(s);
    }
}
