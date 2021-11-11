package com.lzb.interceptor;

/**
 * <br/>
 * Created on : 2021-10-28 22:55
 *
 * @author lizebin
 */
public class AuditInterceptor implements Interceptor {

    public String name = "AuditInterceptor";

    @Override
    public Response intercept(TargetInvocation targetInvocation) {
        System.out.println("audit success");
        return targetInvocation.invoke();
    }
}
