package com.lzb.pricinple.isp.v1;

/**
 * 取钱
 */
public class WithdrawHandler implements TransactionHandler {

    public void handle(final TransactionRequest request) {
        double amount = request.getWithdrawAmount();
    }

}