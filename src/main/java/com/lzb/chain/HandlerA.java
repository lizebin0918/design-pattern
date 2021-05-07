package com.lzb.chain;

import java.util.Objects;

/**
 * <br/>
 * Created on : 2021-05-07 15:36
 * @author chenpi 
 */
public class HandlerA extends Handler {

    @Override
    public void handler() {
        System.out.println("HandlerA 的处理逻辑......");
        if (Objects.nonNull(successor)) {
            successor.handler();
        }
    }
}
