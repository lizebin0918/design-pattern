package com.lzb.pricinple.lsp;
/**
 * <br/>
 * Created on : 2021-04-09 21:32
 * @author lizebin
 */
public class Main {

    abstract class AbstractCall {
        public abstract void call();
    }

    class Phone extends AbstractCall {

        @Override
        public void call() {
            System.out.println("固话");
        }
    }

    class Mobile extends AbstractCall {

        @Override
        public void call() {
            System.out.println("手机");
        }
    }

    private static class Person {
        public void call(AbstractCall phone) {
            phone.call();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        //打固定电话
        person.call(main.new Phone());
        //打移动电话
        person.call(main.new Mobile());
    }

}
