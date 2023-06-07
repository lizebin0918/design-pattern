package com.lzb.state.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeletedOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(DeletedOrderStateService.class);

    public DeletedOrderStateService(IOrderService orderService) {
        super(orderService);
    }
}