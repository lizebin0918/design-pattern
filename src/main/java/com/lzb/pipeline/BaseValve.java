package com.lzb.pipeline;

/**
 * <br/>
 * Created on : 2021-10-29 08:09
 *
 * @author lizebin
 */
public abstract class BaseValve implements Valve {

    private Valve next;


    @Override
    public Valve next() {
        return next;
    }

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    public abstract String invoke(String s);
}
