package com.lzb.factory.yanmoshejimoshi;

import com.lzb.factory.yanmoshejimoshi.factory.Factory1;
import com.lzb.factory.yanmoshejimoshi.factory.Factory2;
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

        Factory1 factory1 = new Factory1();
        log.info("factory1.productA:{}",  factory1.getProductA().getName());
        log.info("factory1.productB:{}",  factory1.getProductB().getName());

        Factory2 factory2 = new Factory2();
        log.info("factory2.productA:{}",  factory2.getProductA().getName());
        log.info("factory2.productB:{}",  factory2.getProductB().getName());
    }

}
