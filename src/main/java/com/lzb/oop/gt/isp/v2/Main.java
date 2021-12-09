package com.lzb.oop.gt.isp.v2;

import com.lzb.oop.gt.isp.TransactionType;
import com.lzb.oop.gt.isp.v2.handler.DepositHandler;
import com.lzb.oop.gt.isp.v2.handler.TransactionHandler;
import com.lzb.oop.gt.isp.v2.handler.TransferHandler;
import com.lzb.oop.gt.isp.v2.handler.WithdrawHandler;
import com.lzb.oop.gt.isp.v2.request.ActualTransactionRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * <br/>
 * Created on : 2021-12-07 23:23
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        // 前端参数
        ActualTransactionRequest request = new ActualTransactionRequest();

        // 类型
        TransactionType type = TransactionType.DEPOSIT;

        // 容器注入
        Map<TransactionType, TransactionHandler> handlers = new HashMap<>();
        handlers.put(TransactionType.TRANSFER, new TransferHandler());
        handlers.put(TransactionType.DEPOSIT, new DepositHandler());
        handlers.put(TransactionType.WITHDRAW, new WithdrawHandler());

        // 处理器
        TransactionHandler handler = handlers.get(type);
        if (handler != null) {
            handler.handle(request);
        }
    }

}
