package com.lzb.oop.gt.isp.v2;

import com.lzb.oop.gt.isp.v2.handler.DepositHandler;
import com.lzb.oop.gt.isp.v2.handler.TransactionHandler;
import com.lzb.oop.gt.isp.v2.request.ActualTransactionRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>
 * Created on : 2021-12-07 23:23
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        ActualTransactionRequest request = new ActualTransactionRequest();
        List<TransactionHandler> handlers = new ArrayList<>();
        handlers.add(new DepositHandler());
        handlers.forEach(item -> item.handle(request));
    }

}
