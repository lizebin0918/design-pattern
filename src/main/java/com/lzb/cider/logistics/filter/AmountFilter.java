package com.lzb.cider.logistics.filter;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * 金额过滤<br/>
 * Created on : 2021-09-27 23:18
 *
 * @author lizebin
 */
@AllArgsConstructor
public class AmountFilter extends Filter {

    private BigDecimal min, max;

    @Override
    public boolean doHandler(Order order) {
        BigDecimal amount = order.getAmount();
        return amount.compareTo(min) > 0 && amount.compareTo(max) < 0;
    }
}
