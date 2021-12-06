package com.lzb.pipeline;

/**
 * <br/>
 * Created on : 2021-10-29 08:13
 *
 * @author lizebin
 */
public class SecondValve extends BaseValve {

    @Override
    public String invoke(String s) {
        s = s.replace("22", "second");
        System.out.println("22 被替换成 second:" + s);
        return s;
    }
}
