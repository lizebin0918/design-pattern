package com.lzb.cider.product_query.specification;

import java.util.function.Function;

/**
 * <br/>
 * Created on : 2022-06-05 23:32
 *
 * @author lizebin
 */
public class ExpressionSpecification<T> extends CompositeSpecification<T> {

    private Function<T, Boolean> expression;

    public ExpressionSpecification(Function<T, Boolean> expression) {
        this.expression = expression;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return expression.apply(o);
    }
}
