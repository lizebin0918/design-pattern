package com.lzb.state.demo;

import lombok.Data;

@Data
public class OrderInfo {
    /**
     * 订单id
     */
    private String ID;
    /**
     * 订单状态
     */
    private OrderStateEnum orderStateEnum;

}
