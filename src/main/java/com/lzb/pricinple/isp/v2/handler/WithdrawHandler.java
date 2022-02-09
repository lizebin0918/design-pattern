package com.lzb.pricinple.isp.v2.handler;

import com.lzb.pricinple.isp.v2.request.WithdrawRequest;

/**
 *
 */
public class WithdrawHandler implements TransactionHandler<WithdrawRequest> {
    @Override
    public void handle(final WithdrawRequest request) {
        double amount = request.getWithdrawAmount();

    }
}