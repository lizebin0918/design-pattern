package com.lzb.cider.product_query;

import lombok.Data;

import java.math.BigDecimal;
import java.util.function.Predicate;

/**
 * 商品信息<br/>
 * Created on : 2022-06-05 10:50
 *
 * @author cidervisioncase
 */
@Data
public class Product {

    /**
     * 颜色
     */
    private Color color;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 重量
     */
    private BigDecimal weight;

    public static Predicate<Product> isColor(Color color) {
        return item -> item.color == color;
    }

    public static Predicate<Product> isBetweenPrice(Range range) {
        return item -> range.between(item.price);
    }

    public static Predicate<Product> isBetweenWeight(Range range) {
        return item -> range.between(item.weight);
    }
}
