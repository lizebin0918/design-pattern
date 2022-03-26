package com.lzb.decorator.demo2.v1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 通过继承的方式扩展功能
 */
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> authMap = new ConcurrentHashMap<String, String>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {

        // 模拟校验
        boolean success = super.preHandle(request, response, handler);

        if (!success) return false;

        String userId = request.substring(8);
        String method = authMap.get(userId);

        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }

}