package com.lzb.decorator.demo2.v1;

/**
 * <br/>
 * Created on : 2022-03-26 22:36
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }

}
