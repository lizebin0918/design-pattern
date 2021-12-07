package com.lzb.oop.gt.isp.v2.handler;

import com.lzb.oop.gt.isp.v2.request.TransferRequest;

public class TransferHandler implements TransactionHandler<TransferRequest> {
  public void handle(final TransferRequest request) {
    double amount = request.getTransferAmount();
  }
}