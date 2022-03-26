package com.lzb.decorator.demo2.v1;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}