package com.lzb.cider.product_query.specification;

/**
 * 规约接口<br/>
 * Created on : 2022-06-05 23:12
 *
 * @author lizebin
 */
public interface ISpecification<T> {

    /**
     * 是否满足条件
     * @param o
     * @return
     */
    boolean isSatisfiedBy(T o);

    ISpecification<T> and(ISpecification<T> s);
    ISpecification<T> or(ISpecification<T> s);
    ISpecification<T> not(ISpecification<T> s);

}
