package com.lzb.pipeline;

/**
 * <br/>
 * Created on : 2021-10-29 08:19
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        String s = "11,22,33";
        System.out.println("input string:" + s);
        StandarPipeline pipeline = new StandarPipeline();
        TailValve tail = new TailValve();
        FirstValve firstValve = new FirstValve();
        SecondValve secondValve = new SecondValve();

        pipeline.setTail(tail);
        pipeline.addValve(firstValve);
        pipeline.addValve(secondValve);

        pipeline.invoke(s);
    }

}
