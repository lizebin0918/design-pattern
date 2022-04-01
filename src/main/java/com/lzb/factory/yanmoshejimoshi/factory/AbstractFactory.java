package com.lzb.factory.yanmoshejimoshi.factory;

/**
 * 抽象工厂<br/>
 * Created on : 2022-04-01 17:40
 *
 * @author lizebin
 */
public interface AbstractFactory {

    /**
     * A产品
     * @return
     */
    AbstractProductA getProductA();

    /**
     * B产品
     * @return
     */
    AbstractProductB getProductB();

}
