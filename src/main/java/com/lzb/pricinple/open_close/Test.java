package com.lzb.pricinple.open_close;

import java.math.BigDecimal;

/**
 * 开闭原则（错误示例）<br/>
 * Created on : 2021-04-09 21:05
 * @author lizebin
 */
public class Test {

    private static class ABank {
        private static String NAME = "ABank";
        public void transfer(BigDecimal amount) {
            System.out.println("ABank 转账:" + amount.toPlainString());
        }
    }

    private static class BBank {
        private static String NAME = "BBank";
        public void transfer(BigDecimal amount) {
            System.out.println("BBank 转账:" + amount.toPlainString());
        }
    }

    private static class CBank {
        private static String NAME = "CBank";
        public void transfer(BigDecimal amount) {
            System.out.println("CBank 转账:" + amount.toPlainString());
        }
    }

    /**
     * 如果添加一个 DBank，EBank?????
     */
    public void doTransfer(String name, BigDecimal amount) {
        if (name.equals(ABank.NAME)) {
            new ABank().transfer(amount);
        } else if (name.equals(BBank.NAME)) {
            new BBank().transfer(amount);
        } else if (name.equals(CBank.NAME)) {
            new CBank().transfer(amount);
        }
    }

}
