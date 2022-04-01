package com.lzb.factory.yanmoshejimoshi.factory;

import com.lzb.factory.yanmoshejimoshi.product.ProductA1;
import com.lzb.factory.yanmoshejimoshi.product.ProductB1;

/**
 * <br/>
 * Created on : 2022-04-01 17:53
 *
 * @author lizebin
 */
public class Factory1 implements AbstractFactory {


    @Override
    public AbstractProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB1();
    }
}
