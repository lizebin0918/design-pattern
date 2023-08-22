package com.lzb.factory.yanmoshejimoshi;

import com.lzb.factory.yanmoshejimoshi.factory.FactoryProductA1B1;
import com.lzb.factory.yanmoshejimoshi.factory.FactoryProductA2B2;
import lombok.extern.slf4j.Slf4j;

/**
 * 提供一个创建一系列相关或者相互依赖对象的接口，而无需指定它们的具体类，除了创建实例，而且实例之间是有关系的<br/>
 *
 * 说白了抽象工厂创建的是一套有关系的实例，抽象工程 生成 具体工厂
 *
 * Created on : 2022-04-01 17:55
 *
 * @author lizebin
 */
@Slf4j
public class Main {

    public static void main(String[] args) {

        FactoryProductA1B1 factoryProductA1B1 = new FactoryProductA1B1();
        log.info("FactoryProductA1B1.productA:{}",  factoryProductA1B1.getProductA().getName());
        log.info("FactoryProductA1B1.productB:{}",  factoryProductA1B1.getProductB().getName());

        FactoryProductA2B2 factoryProductA2B2 = new FactoryProductA2B2();
        log.info("factoryProductA2B2.productA:{}",  factoryProductA2B2.getProductA().getName());
        log.info("factoryProductA2B2.productB:{}",  factoryProductA2B2.getProductB().getName());
    }

}
