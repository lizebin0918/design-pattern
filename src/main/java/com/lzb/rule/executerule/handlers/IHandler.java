package com.lzb.rule.executerule.handlers;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 处理器泛型
 */
public interface IHandler<T> {

    /**
     * 处理事件Event
     *
     * @param t
     */
    void onEvent(T t);
}
