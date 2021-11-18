package com.lzb.decorator.v2;

import lombok.Data;

/**
 * <br/>
 * Created on : 2021-05-15 20:57
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        PanCake panCake = new BasePanCake();
        panCake = new EggDecorator(panCake);
        panCake = new EggDecorator(panCake);
        panCake = new SausageDecorator(panCake);
        System.out.println(panCake.getMsg());
        System.out.println("总价:" + panCake.getPrice());

        Person lizebin = new Lizebin("lizebin");
        System.out.println(lizebin.getName());

        // 变态的多态：https://wiki.jikexueyuan.com/project/java-enhancement/java-three.html
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }

    @Data
    public static abstract class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

    }

    public static class Lizebin extends Person {

        public Lizebin(String name) {
            super(name);
        }

        @Override
        public String getName() {
            return getMyName() + super.getName();
        }

        public String getMyName() {
            return "myName:";
        }

    }

    public static class A {

        public String show(D obj) {
            return ("A and D");
        }

        public String show(A obj) {
            return ("A and A");
        }
    }

    public static class B extends A {
        public String show(B obj){
            return ("B and B");
        }

        @Override
        public String show(A obj){
            return ("B and A");
        }
    }

    public static class C extends B{

    }

    public static class D extends B{

    }

}
