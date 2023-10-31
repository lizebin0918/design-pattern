package com.lzb.vistor.lzb;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * 优惠券聚合根判断订单是否购买蔬菜，才赠送优惠券<br/>
 * Created on : 2022-05-21 18:38
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        ProductGateway productGateway = new ProductGateway();
        Order order = new Order();
        order.setOrderItems(Arrays.asList(new OrderItem(1, 2, 3)));
        if (Boolean.TRUE.equals(order.accept(productGateway::hasVegatable))) {
            System.out.println("包含蔬菜");
        } else {
            System.out.println("不包含蔬菜");
        }

        Product product = order.getOrderItems().get(0).getProduct(productGateway::getById);
        System.out.println(JSON.toJSONString(product));
    }

    @Data
    private static class Order {

        private long orderId;
        private List<OrderItem> orderItems;

        public <T> T accept(OrderVisitor<T> visitor) {
            return visitor.visit(orderItems.stream().map(OrderItem::getProductId).collect(Collectors.toSet()));
        }

    }

    private interface OrderVisitor<T> {
        T visit(Set<Long> productIds);
    }

    @Data
    private static class OrderItem {
        private long id;
        private long orderId;
        private long productId;

        public OrderItem(long id, long orderId, long productId) {
            this.id = id;
            this.orderId = orderId;
            this.productId = productId;
        }

        Product getProduct(Function<Long, Product> productProvider) {
            return productProvider.apply(this.productId);
        }
    }

    private static class ProductGateway {

        public boolean hasVegatable(Set<Long> productIds) {
            return productIds.contains(1L);
        }

        public Product getById(long productId) {
            return new Product();
        }
    }

    @Data
    private static class Product {
        private long id;
        private String name;
    }

}
