package com.lzb.cider.product_query.specification;

import java.util.function.Predicate;

/**
 * <br/>
 * Created on : 2022-06-05 23:32
 *
 * @author lizebin
 */
public class ExpressionSpecification<T> extends CompositeSpecification<T> {

    private Predicate<T> expression;

    public ExpressionSpecification(Predicate<T> expression) {
        this.expression = expression;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return expression.test(o);
    }
}
