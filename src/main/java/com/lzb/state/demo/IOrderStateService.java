package com.lzb.state.demo;

public interface IOrderStateService {
    boolean pay(OrderInfo orderInfo);

    boolean reminder(OrderInfo orderInfo);

    boolean delete(OrderInfo orderInfo);

}