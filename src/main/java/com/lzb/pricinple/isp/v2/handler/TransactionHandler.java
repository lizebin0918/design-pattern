package com.lzb.pricinple.isp.v2.handler;

import com.lzb.pricinple.isp.v2.request.TransactionRequest;

/**
 * @author lizebin
 */
public interface TransactionHandler<T extends TransactionRequest> {
    
    void handle(T request);

}