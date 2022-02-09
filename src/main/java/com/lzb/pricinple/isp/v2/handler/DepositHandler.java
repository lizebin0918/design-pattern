package com.lzb.pricinple.isp.v2.handler;

import com.lzb.pricinple.isp.v2.request.DepositRequest;

public class DepositHandler implements TransactionHandler<DepositRequest> {
    @Override
    public void handle(final DepositRequest request) {
        double amount = request.getDepositAmount();
        System.out.println("deposit:" + amount);
    }
}