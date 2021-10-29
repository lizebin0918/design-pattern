package com.lzb.pipeline;

/**
 * 管道<br/>
 * Created on : 2021-10-29 08:07
 *
 * @author lizebin
 */
public interface Pipeline {

    Valve head();

    Valve tail();

    void tail(Valve v);

    void addValve(Valve v);

}
