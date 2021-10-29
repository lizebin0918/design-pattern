package com.lzb.pipeline;

/**
 * <br/>
 * Created on : 2021-10-29 08:14
 *
 * @author lizebin
 */
public class TailValve extends BaseValve {

    @Override
    public void invoke(String s) {
        s = s.replace("33", "third");
        System.out.println("33 被替换成 third:" + s);
    }

}
