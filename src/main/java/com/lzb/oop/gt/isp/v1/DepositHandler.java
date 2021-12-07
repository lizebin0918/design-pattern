package com.lzb.oop.gt.isp.v1;

/**
 * 存钱
 */
public class DepositHandler implements TransactionHandler {

    public void handle(final TransactionRequest request) {
        double amount = request.getDepositAmount();
    }

}