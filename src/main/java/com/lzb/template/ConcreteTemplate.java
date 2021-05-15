package com.lzb.template;

public class ConcreteTemplate extends AbstractTemplate {

    //基本方法的实现
    @Override
    public void doExecute() {
        System.out.println("执行业务逻辑");
    }

}