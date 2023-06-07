package com.lzb.state.demo;

public interface IOrderService {

    boolean pay(OrderInfo orderInfo);

    boolean reminder(OrderInfo orderInfo);

    boolean delete(OrderInfo orderInfo);

    void changeState(OrderInfo orderInfo, OrderStateEnum newState);
}