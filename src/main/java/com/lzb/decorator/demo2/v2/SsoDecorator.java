package com.lzb.decorator.demo2.v2;

import com.lzb.decorator.demo2.v1.HandlerInterceptor;

public abstract class SsoDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator(){}

    /**
     *
     * @param handlerInterceptor 被装饰实例
     */
    SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }

}