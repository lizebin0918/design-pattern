package com.lzb.pricinple.isp.v2.request;

public interface WithdrawRequest extends TransactionRequest {
    double getWithdrawAmount();
}