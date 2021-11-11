package com.lzb.interceptor;

/**
 * <br/>
 * Created on : 2021-10-28 22:57
 *
 * @author lizebin
 */
public class LogInterceptor implements Interceptor {

    public String name = "LogInterceptor";

    @Override
    public Response intercept(TargetInvocation targetInvocation) {
        System.out.println("Logging Begin");
        Response response = targetInvocation.invoke();
        System.out.println("Logging End");
        return response;
    }
}
