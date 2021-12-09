package com.lzb.oop.gt.isp.v1;

import com.lzb.oop.gt.isp.TransactionType;

import java.util.HashMap;
import java.util.Map;

/**
 * 一切看上去都很好，不少人在实际工作中也会写出类似的代码。然而，在这个实现里，有一个接口就太“胖”了，它就是 TransactionRequest。<br/>
 * Created on : 2021-12-07 22:51
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Map<TransactionType, TransactionHandler> handlers = new HashMap<>();
        TransactionRequest request = new TransactionRequest();
        TransactionHandler handler = handlers.get(request.getType());
        if (handler != null) {
            handler.handle(request);
        }
    }

}
