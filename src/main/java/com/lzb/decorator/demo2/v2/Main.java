package com.lzb.decorator.demo2.v2;

import com.lzb.decorator.demo2.v1.SsoInterceptor;

/**
 * <br/>
 * Created on : 2022-03-26 22:45
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        // 递归调用了....
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }

}
