package com.lzb.pricinple.isp.v2.request;

import com.lzb.pricinple.isp.TransactionType;

/**
 * 接收具体的请求字段
 * 我们把 TransactionRequest 变成了一个接口，目的是给后面的业务处理进行统一接口，
 * 而 ActualTransactionRequest 则对应着原来的实现类。我们引入了 DepositRequest、WithdrawRequest、TransferRequest 等几个“瘦”接口，
 * 它们就是分别供不同的业务处理方法使用的接口。
 * @author lizebin
 */
public class ActualTransactionRequest implements DepositRequest, WithdrawRequest, TransferRequest {

    // 获取操作类型
    public TransactionType getType() {
        return TransactionType.DEPOSIT;
    }

    @Override
    public double getDepositAmount() {
        return 0;
    }

    @Override
    public double getTransferAmount() {
        return 0;
    }

    @Override
    public double getWithdrawAmount() {
        return 0;
    }

}