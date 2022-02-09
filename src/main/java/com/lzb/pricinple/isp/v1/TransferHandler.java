package com.lzb.pricinple.isp.v1;

/**
 * 转账
 */
public class TransferHandler implements TransactionHandler {

    public void handle(final TransactionRequest request) {
        double amount = request.getTransferAmount();
    }

}