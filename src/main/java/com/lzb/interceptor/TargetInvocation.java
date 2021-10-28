package com.lzb.interceptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <br/>
 * Created on : 2021-10-28 22:49
 *
 * @author lizebin
 */
public class TargetInvocation {

    private final List<Interceptor> interceptorList = new ArrayList<>();
    /**
     * 这个成员变量有点厉害....
     */
    private Iterator<Interceptor> iterator;
    private Target target;
    private Request request;

    public Response invoke() {
        if (iterator.hasNext()) {
            Interceptor interceptor = iterator.next();
            // 递归调用 invoke()
            interceptor.intercept(this);
        }
        return target.execute(request);
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptorList.add(interceptor);
        iterator = interceptorList.iterator();
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
