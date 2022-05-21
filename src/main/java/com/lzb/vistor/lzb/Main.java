package com.lzb.vistor.lzb;

import lombok.Data;

import java.util.List;

/**
 * 优惠券聚合根判断订单是否购买蔬菜，才赠送优惠券<br/>
 * Created on : 2022-05-21 18:38
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

    }

    @Data
    private static class Order {

        private long orderId;
        private List<OrderItem> orderItems;

        <T> T accept(OrderVisitor<T> visitor) {
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
        private String productName;
    }

    @Data
    private static class Coupon {

        private long couponId;

        public void giveCoupon() {

        }


    }

}
