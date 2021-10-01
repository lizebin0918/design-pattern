package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;

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

    public final boolean filter(Order order) {
        boolean isNext = doFilter(order);
        if (next != null && isNext) {
            return next.filter(order);
        }
        return isNext;
    }

    /**
     * 过滤逻辑
     * @return
     */
    public abstract boolean doFilter(Order order);

}
