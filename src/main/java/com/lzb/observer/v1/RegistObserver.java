package com.lzb.observer.v1;

/**
 * 注册观察者<br/>
 * Created on : 2021-06-18 10:36
 *
 * @author chenpi
 */
public interface RegistObserver {

    void postHandler(Member member);

}
