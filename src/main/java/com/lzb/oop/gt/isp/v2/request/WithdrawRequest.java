package com.lzb.oop.gt.isp.v2.request;

public interface WithdrawRequest extends TransactionRequest {
    double getWithdrawAmount();
}