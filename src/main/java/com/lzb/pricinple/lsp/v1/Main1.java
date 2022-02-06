package com.lzb.pricinple.lsp.v1;
/**
 * 扩展父类功能，不能改变父类原有功能<br/>
 * Created on : 2021-04-09 22:02
 * @author lizebin
 */
public class Main1 {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.add(1, 1));
    }


    private static class A {
        public int add(int a, int b) {
            return a + b;
        }

    }

    private static class B extends A {

        /**
         * 禁止覆写「已有实现」的方法
         * @param a
         * @param b
         * @return
         */
        public int fun1(int a, int b) {
            return a - b;
        }

        public int fun2(int a, int b) {
            return fun1(a, b) - 10;
        }
    }
}


