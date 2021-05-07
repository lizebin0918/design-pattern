package com.lzb.chain;

import java.util.Objects;

/**
 * <br/>
 * Created on : 2021-05-07 15:36
 * @author chenpi 
 */
public class HandlerB extends Handler {

    @Override
    public void handler() {
        System.out.println("HandlerB 的处理逻辑......");
        if (Objects.nonNull(successor)) {
            successor.handler();
        }
    }
}
