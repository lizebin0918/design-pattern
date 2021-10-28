package com.lzb.interceptor;

/**
 * <br/>
 * Created on : 2021-10-28 22:48
 *
 * @author lizebin
 */
public interface Interceptor {

    Response intercept(TargetInvocation targetInvocation);

}
