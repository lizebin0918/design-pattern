package com.lzb.vistor.lzb;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        if (order.accept(productGateway::hasVegatable)) {
            System.out.println("包含蔬菜");
        } else {
            System.out.println("不包含蔬菜");
        }
    }

    @Data
    private static class Order {

        private long orderId;
        private List<OrderItem> orderItems;

        public <T> T accept(OrderVisitor<T> visitor) {
            return visitor.visit(orderItems);
        }

    }

    private interface OrderVisitor<T> {
        T visit(List<OrderItem> orderItems);
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
    }

    private static class ProductGateway {
        public boolean hasVegatable(List<OrderItem> items) {
            return items.stream().map(OrderItem::getProductId).collect(Collectors.toList()).contains(1L);
        }
    }

}
