package com.lzb.builder.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import com.lzb.builder.valueObj.FullName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

/**
 * <br/>
 * Created on : 2023-06-04 09:21
 * @author mac
 */
@Getter
@AllArgsConstructor
public class Order {

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    private final long orderId;

    @NonNull
    private final LocalDateTime atPlace;

    @NonNull
    private final BigDecimal payAmount;

    @NonNull
    private final OrderAddress orderAddress;

    private Optional<OrderAddress> deliveryAddress;

    Order(OrderBuilder orderBuilder) {
        orderId = orderBuilder.orderId;
        atPlace = orderBuilder.atPlace;
        payAmount = orderBuilder.payAmount;
        orderAddress = orderBuilder.orderAddress;
    }

    /**
     * <br/>
     * Created on : 2023-06-04 09:27
     * @author mac
     */
    public static class OrderBuilder {

        OrderAddress orderAddress;

        private long orderId;

        private LocalDateTime atPlace;

        private BigDecimal payAmount;

        OrderBuilder() {

        }

        public OrderBuilder orderId(long orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder atPlace(LocalDateTime atPlace) {
            this.atPlace = atPlace;
            return this;
        }

        public OrderBuilder payAmount(BigDecimal payAmount) {
            this.payAmount = payAmount;
            return this;
        }

        public OrderBuilder orderAddress(OrderAddress orderAddress) {
            this.orderAddress = orderAddress;
            return this;
        }

        public OrderBuilder orderAddress(String country, FullName fullName) {
            this.orderAddress = OrderAddress.builder().orderId(orderId).country(country).fullName(fullName).build();
            return this;
        }

        public Order build() {
            return new Order(this);
        }

        public OrderBuilder from(OrderBuilder from) {
            this.orderId = from.orderId;
            this.atPlace = from.atPlace;
            this.payAmount = from.payAmount;
            this.orderAddress = from.orderAddress;
            return this;
        }

        public OrderBuilder copy() {
            return new OrderBuilder()
                    .orderId(orderId)
                    .atPlace(atPlace)
                    .payAmount(payAmount)
                    .orderAddress(orderAddress);
        }

        public OrderBuilder validate() {
            if (StringUtils.isBlank(orderAddress.getCountry())) {
                throw new IllegalArgumentException("国家不能为空");
            }
            return this;
        }

    }
}
