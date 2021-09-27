package com.lzb.cider.logistics.filter;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * 重量过滤<br/>
 * Created on : 2021-09-27 22:55
 *
 * @author lizebin
 */
@AllArgsConstructor
public class WeigthFilter extends Filter {

    private BigDecimal min, max;

    @Override
    public boolean doHandler(Order order) {
        BigDecimal weight = order.getWeight();
        return weight.compareTo(min) > 0 && weight.compareTo(max) < 0;
    }
}
