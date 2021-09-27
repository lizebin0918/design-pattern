package com.lzb.cider.logistics.filter;

/**
 * Handler<br/>
 * Created on : 2021-09-27 22:46
 *
 * @author lizebin
 */
public abstract class Filter {

    protected Filter next = null;

    public void setNext(Filter next) {
        this.next = next;
    }

    public final boolean handle(Order order) {
        boolean isNext = doHandler(order);
        if (next != null && isNext) {
            return next.handle(order);
        }
        return isNext;
    }

    /**
     * 过滤逻辑
     * @return
     */
    public abstract boolean doHandler(Order order);

}
