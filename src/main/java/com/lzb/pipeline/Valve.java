package com.lzb.pipeline;

/**
 * 阀门<br/>
 * Created on : 2021-10-29 08:06
 *
 * @author lizebin
 */
public interface Valve {

    Valve next();

    void setNext(Valve valve);

    String invoke(String s);

}
