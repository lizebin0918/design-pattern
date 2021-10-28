package com.lzb.interceptor;

/**
 * <br/>
 * Created on : 2021-10-28 22:58
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        TargetInvocation targetInvocation = new TargetInvocation();
        targetInvocation.addInterceptor(new LogInterceptor());
        targetInvocation.addInterceptor(new AuditInterceptor());
        targetInvocation.setRequest(new Request());
        targetInvocation.setTarget(request -> {
            System.out.println("execute begin");
            Response response = new Response();
            System.out.println("execute end");
            return response;
        });
        targetInvocation.invoke();

    }

}
