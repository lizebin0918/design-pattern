package com.lzb.pipeline;

/**
 * <br/>
 * Created on : 2021-10-29 08:11
 *
 * @author lizebin
 */
public class FirstValve extends BaseValve {

    @Override
    public void invoke(String s) {
        s = s.replace("11", "first");
        System.out.println("11 替换成 first:" + s);
        next().invoke(s);
    }
}
