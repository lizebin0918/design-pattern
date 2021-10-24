package com.lzb.observer.v2;


/**
 * 观察者<br/>
 * Created on : 2021-10-24 08:09
 *
 * @author lizebin
 */
public interface Observer {

    void update(Observable o, Object arg);

}
