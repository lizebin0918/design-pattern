package com.lzb.oop.gt.isp.v2;

import com.lzb.oop.gt.isp.v1.TransactionType;
import com.lzb.oop.gt.isp.v2.handler.DepositHandler;
import com.lzb.oop.gt.isp.v2.handler.TransactionHandler;
import com.lzb.oop.gt.isp.v2.request.ActualTransactionRequest;
import com.lzb.oop.gt.isp.v2.request.DepositRequest;
import com.lzb.oop.gt.isp.v2.request.TransactionRequest;

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
        ActualTransactionRequest request = new ActualTransactionRequest();
        TransactionType type = TransactionType.TRANSFER;
        Map<TransactionType, TransactionHandler<? extends TransactionRequest>> handlers = new HashMap<>();
        TransactionHandler<DepositRequest> deposit = new DepositHandler();
        handlers.put(TransactionType.DEPOSIT, deposit);

        handlers.get(type).handle(request);

    }

}
