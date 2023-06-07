package com.lzb.state.demo;

/**
 * 拆分一个单独的service维护这个状态，多个状态的处理逻辑相同的，那就可以这样抽取一个子状态
 */
public interface IReminderStateService {

    boolean reminder(OrderInfo orderInfo);
}