package com.lzb.cider.product_query;

import com.lzb.cider.product_query.specification.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductsTest {

    private Products products;

    @BeforeEach
    public void setup() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(Color.RED, new BigDecimal(3), new BigDecimal(2)));
        productList.add(new Product(Color.ORANGE, new BigDecimal(4), new BigDecimal(8)));
        productList.add(new Product(Color.BLUE, new BigDecimal(5), new BigDecimal(2)));
        productList.add(new Product(Color.YELLOW, new BigDecimal(6), new BigDecimal(7)));
        productList.add(new Product(Color.RED, new BigDecimal(12), new BigDecimal(10)));
        productList.add(new Product(Color.YELLOW, new BigDecimal(20), new BigDecimal(8)));
        productList.add(new Product(Color.BLUE, new BigDecimal(12), new BigDecimal(9)));
        productList.add(new Product(Color.ORANGE, new BigDecimal(18), new BigDecimal(19)));
        productList.add(new Product(Color.ORANGE, new BigDecimal(10), new BigDecimal(22)));
        productList.add(new Product(Color.YELLOW, new BigDecimal(11), new BigDecimal(52)));
        products = new Products(productList);
    }

    @Test
    void listByColor() {
        assertEquals(3, products.listBy(Color.ORANGE).size());
        assertEquals(2, products.listBy(Color.RED).size());
        assertEquals(3, products.listBy(Color.YELLOW).size());
        assertEquals(2, products.listBy(Color.BLUE).size());
    }

    @Test
    void testListByMapper() {
        assertEquals(3, products.listBy(Product::getPrice, new Range(new BigDecimal(3), new BigDecimal(5))).size());
        assertEquals(2, products.listBy(Product::getPrice, new Range(new BigDecimal(12), new BigDecimal(12))).size());
        assertEquals(2, products.listBy(Product::getPrice, new Range(new BigDecimal(13), new BigDecimal(20))).size());
    }

    @Test
    void testListByColorAndPrice() {
        Range priceRange = new Range(new BigDecimal(3), new BigDecimal(5));
        assertEquals(1, products.listBy(Color.ORANGE, priceRange).size());
        assertEquals(1, products.listBy(Color.BLUE, priceRange).size());
        assertEquals(1, products.listBy(Color.RED, priceRange).size());
    }

    @Test
    void listByColorAndPriceOrWeight() {
        Range priceRange = new Range(new BigDecimal(3), new BigDecimal(12));
        Range weightRange = new Range(new BigDecimal(3), new BigDecimal(12));
        assertEquals(2, products.listByColorAndPriceOrWeight(Color.RED, priceRange, weightRange).size());
        priceRange = new Range(new BigDecimal(1), new BigDecimal(1));
        weightRange = new Range(new BigDecimal(3), new BigDecimal(12));
        assertEquals(1, products.listByColorAndPriceOrWeight(Color.RED, priceRange, weightRange).size());
    }

    @Test
    void listByColorAndPriceAndWeight() {
        Range priceRange = new Range(new BigDecimal(3), new BigDecimal(12));
        Range weightRange = new Range(new BigDecimal(3), new BigDecimal(12));
        assertEquals(1, products.listByColorAndPriceAndWeight(Color.RED, priceRange, weightRange).size());
        priceRange = new Range(new BigDecimal(1), new BigDecimal(1));
        weightRange = new Range(new BigDecimal(3), new BigDecimal(12));
        assertEquals(0, products.listByColorAndPriceAndWeight(Color.RED, priceRange, weightRange).size());
    }

    void listBy() {
        ISpecification<Product> w1 = new AndSpecification<>(new ExpressionSpecification<>(Product::getColor), new ExpressionSpecification<>());
    }
}