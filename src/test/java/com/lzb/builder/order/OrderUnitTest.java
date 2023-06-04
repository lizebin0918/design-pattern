package com.lzb.builder.order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import com.alibaba.fastjson.JSON;
import com.lzb.builder.valueObj.FullName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <br/>
 * Created on : 2023-06-04 09:44
 * @author mac
 */
class OrderUnitTest {

    @Test
    void test() {
        Order.OrderBuilder orderBuilder = Order.builder()
                .orderId(1L)
                .atPlace(LocalDate.of(2023, 1,1).atStartOfDay())
                .payAmount(BigDecimal.ONE);
        Order order = orderBuilder.build();
        String exceptString = "{\"atPlace\":\"2023-01-01T00:00:00\",\"orderId\":1,\"payAmount\":1}";
        Assertions.assertEquals(exceptString, JSON.toJSONString(order));
    }

    @Test
    void test_from() {
        Order.OrderBuilder orderBuilder = Order.builder()
                .orderId(1L)
                .atPlace(LocalDate.of(2023, 1,1).atStartOfDay())
                .payAmount(BigDecimal.ONE);
        Order order = Order.builder().from(orderBuilder).orderId(2L).build();
        String exceptString = "{\"atPlace\":\"2023-01-01T00:00:00\",\"orderId\":2,\"payAmount\":1}";
        Assertions.assertEquals(exceptString, JSON.toJSONString(order));
    }

    @Test
    void test_copy() {
        Order.OrderBuilder orderBuilder = Order.builder()
                .orderId(1L)
                .atPlace(LocalDate.of(2023, 1,1).atStartOfDay())
                .payAmount(BigDecimal.ONE);
        Order order1 = orderBuilder.build();

        Order order2 = orderBuilder.copy().orderId(2L).payAmount(new BigDecimal(2)).build();

        String exceptString1 = "{\"atPlace\":\"2023-01-01T00:00:00\",\"orderId\":1,\"payAmount\":1}";
        Assertions.assertEquals(exceptString1, JSON.toJSONString(order1));

        String exceptString2 = "{\"atPlace\":\"2023-01-01T00:00:00\",\"orderId\":2,\"payAmount\":2}";
        Assertions.assertEquals(exceptString2, JSON.toJSONString(order2));
    }

    @Test
    void test_address() {
        Order.OrderBuilder orderBuilder = Order.builder()
                .orderId(1L)
                .atPlace(LocalDate.of(2023, 1,1).atStartOfDay())
                .payAmount(BigDecimal.ONE).orderAddress("US", new FullName("li", "zebin"));
        Order order = orderBuilder.build();
        String exceptString = "{\"atPlace\":\"2023-01-01T00:00:00\",\"orderAddress\":{\"country\":\"US\",\"fullName\":{\"firstName\":\"li\",\"lastName\":\"zebin\"},\"orderId\":1},\"orderId\":1,\"payAmount\":1}";
        Assertions.assertEquals(exceptString, JSON.toJSONString(order));
    }

    @Test
    void test_validate() {
        Order.OrderBuilder orderBuilder = Order.builder()
                .orderId(1L)
                .atPlace(LocalDate.of(2023, 1,1).atStartOfDay())
                .payAmount(BigDecimal.ONE).orderAddress("", new FullName("li", "zebin"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> orderBuilder.validate().build());
    }

    @Test
    void test_address_null() {
        Order order = Order.builder()
                .orderId(1L)
                .atPlace(LocalDate.of(2023, 1, 1).atStartOfDay())
                .payAmount(BigDecimal.ONE).build();
        String firstName = Optional.ofNullable(order.getOrderAddress())
                .map(OrderAddress::getFullName)
                .map(FullName::getFirstName)
                .orElse(null);
        Assertions.assertNull(firstName);
    }

}
