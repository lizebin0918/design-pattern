package com.lzb.pricinple.lsp;

import java.util.HashMap;
import java.util.Map;

/**
 * 错误例子：子类重写父类方法<br/>
 * Created on : 2021-04-09 22:30
 * @author lizebin
 */
public class Main2 {

    public static void main(String[] args) {
        //Parent p = new Parent();
        Child c = new Child();
        Map<String, String> map = new HashMap<>();
        c.doSomething(map);
    }

    private static class Parent {
        public void doSomething(HashMap<String, String> map) {
            System.out.println("parent do something");
        }
    }

    private static class Child extends Parent {
        public void doSomething(Map<String, String> map) {
            System.out.println("child do something");
        }
    }

}
