package com.lzb.factory.yanmoshejimoshi.factory;

import com.lzb.factory.yanmoshejimoshi.product.ProductA2;
import com.lzb.factory.yanmoshejimoshi.product.ProductB2;

/**
 * <br/>
 * Created on : 2022-04-01 17:53
 *
 * @author lizebin
 */
public class FactoryProductA2B2 implements AbstractFactory {


    @Override
    public AbstractProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB2();
    }
}
