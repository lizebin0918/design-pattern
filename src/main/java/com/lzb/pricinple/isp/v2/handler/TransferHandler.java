package com.lzb.pricinple.isp.v2.handler;

import com.lzb.pricinple.isp.v2.request.TransferRequest;

/**
 * @author lizebin
 */
public class TransferHandler implements TransactionHandler<TransferRequest> {
  @Override
  public void handle(final TransferRequest request) {
    double amount = request.getTransferAmount();
  }
}