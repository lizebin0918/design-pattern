package com.lzb.proxy;

import java.util.function.Consumer;

import lombok.Getter;

/**
 * 事务帮助类<br/>
 * Created on : 2023-04-02 23:02
 * @author lizebin
 */
@Getter
public class Transactions {

    private String preExecute;
    private String afterExecute;

    private Transactions() {}

    public static void execute(Consumer<Transactions> consumer) {
        Transactions transactions = new Transactions();
        try {
            consumer.accept(transactions);
            System.out.println(transactions.getPreExecute());
            transactions.commit();
        } finally {
            transactions.done();
            System.out.println(transactions.getAfterExecute());
        }
    }

    private void commit() {
        System.out.println("commit transaction");
    }

    private void done() {
        System.out.println("done transaction");
    }

    public Transactions preExecute(String s) {
        preExecute = s;
        return this;
    }

    public Transactions afterExecute(String s) {
        afterExecute = s;
        return this;
    }

    public static void main(String[] args) {
        Transactions.execute(transactions -> {
            transactions.preExecute("this is preExecute").afterExecute("this is preExecute");
        });
    }

}
