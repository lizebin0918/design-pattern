package com.lzb.pricinple.open_close;

import java.math.BigDecimal;

/**
 * 优化版<br/>
 * Created on : 2021-04-09 21:13
 * @author lizebin
 */
public class TestOptimize {

    private abstract class Bank {
        abstract void transfer(BigDecimal amount);
    }

    private class ABank extends Bank {
        public void transfer(BigDecimal amount) {
            System.out.println("ABank 转账:" + amount.toPlainString());
        }
    }

    private class BBank extends Bank {
        public void transfer(BigDecimal amount) {
            System.out.println("BBank 转账:" + amount.toPlainString());
        }
    }

    private class CBank extends Bank {
        public void transfer(BigDecimal amount) {
            System.out.println("CBank 转账:" + amount.toPlainString());
        }
    }

    /**
     * 如果新增 DBank，EBank 直接添加类即可
     * @param bank
     * @param amount
     */
    public void transfer(Bank bank, BigDecimal amount) {
        bank.transfer(amount);
    }

}
