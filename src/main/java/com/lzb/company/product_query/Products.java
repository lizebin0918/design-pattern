package com.lzb.company.product_query;

import com.lzb.company.product_query.filter.AndFilter;
import com.lzb.company.product_query.filter.ColorFilter;
import com.lzb.company.product_query.filter.PriceRangeFilter;
import com.lzb.company.product_query.specification.ISpecification;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 商品集合<br/>
 * Created on : 2022-06-05 10:53
 *
 * @author cidervisioncase
 */
public class Products {

    private final List<Product> products;

    public Products(List<Product> products) {
        this.products = products;
    }

    /**
     * 查询指定颜色的商品
     *
     * @param color
     * @return
     */
    public List<Product> listBy(Color color) {
        //return products.stream().filter(isColor(color)).collect(Collectors.toUnmodifiableList());
        ColorFilter colorFilter = new ColorFilter(color);
        return products.stream().filter(colorFilter::isSatisfiedBy).collect(Collectors.toUnmodifiableList());
    }

    /**
     * 查询指定字段符合区间的数据
     *
     * @param mapper
     * @param range
     * @return
     */
    public List<Product> listBy(Function<Product, BigDecimal> mapper, Range range) {
        return products.stream().filter(item -> range.between(mapper.apply(item))).collect(Collectors.toUnmodifiableList());
    }

    /**
     * 查询指定颜色:isColor = '' and price between ();
     *
     * @param color
     * @param priceRange
     * @return
     */
    public List<Product> listBy(Color color, Range priceRange) {
        ColorFilter colorFilter = new ColorFilter(color);
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(priceRange);
        AndFilter andFilter = new AndFilter(colorFilter, priceRangeFilter);
        /*return products.stream()
                .filter(colorFilter::isSatisfiedBy)
                .filter(priceRangeFilter::isSatisfiedBy)
                .collect(Collectors.toUnmodifiableList());*/
        return products.stream()
            .filter(andFilter::isSatisfiedBy)
            .collect(Collectors.toUnmodifiableList());
    }

    /**
     * isColor = ? and (price between ? and ? or weight between ? and ?)
     *
     * @param color
     * @param priceRange
     * @param weightRange
     * @return
     */
    public List<Product> listByColorAndPriceOrWeight(Color color, Range priceRange, Range weightRange) {
        return products.stream()
                .filter(Product.isColor(color))
                .filter(Product.isBetweenWeight(weightRange).or(Product.isBetweenPrice(priceRange)))
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     * isColor = ? and price between ? and ? and weight between ? and ?
     *
     * @param color
     * @param priceRange
     * @param weightRange
     * @return
     */
    public List<Product> listByColorAndPriceAndWeight(Color color, Range priceRange, Range weightRange) {
        return products.stream()
            .filter(Product.isColor(color))
            .filter(Product.isBetweenWeight(weightRange))
            .filter(Product.isBetweenPrice(priceRange))
            .collect(Collectors.toUnmodifiableList());
    }

    public List<Product> listBy(ISpecification<Product> where) {
        return products.stream().filter(where::isSatisfiedBy).collect(Collectors.toUnmodifiableList());
    }
}
