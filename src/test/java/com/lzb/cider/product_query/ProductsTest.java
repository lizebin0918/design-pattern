package com.lzb.cider.product_query;

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
    }

    @Test
    void testListBy() {
    }

    @Test
    void testListBy1() {
    }

    @Test
    void listByColorAndPriceOrWeight() {
    }
}