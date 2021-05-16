package com.lzb.command;

import java.util.function.Function;

/**
 * 命令模式<br/>
 * Created on : 2021-05-16 22:08
 * @author lizebin
 */
public class Test {

    private static class Request {
        private Function<Integer, Integer> func;
        private int number;

        public Request(Function<Integer, Integer> func, int number) {
            this.func = func;
            this.number = number;
        }

        void handle() {
            System.out.println(func.apply(number));
        }
    }

    public static void main(String[] args) {
        new Request(n -> n + 10, 90).handle();
    }

}
