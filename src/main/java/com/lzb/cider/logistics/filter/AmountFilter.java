package com.lzb.cider.logistics.filter;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 金额过滤<br/>
 * Created on : 2021-09-27 23:18
 *
 * @author lizebin
 */
public class AmountFilter extends Filter {

    private final BigDecimal min, max;

    private static final String FORMAT = "%s:%s";

    @Override
    public boolean doHandler(Order order) {
        BigDecimal amount = order.getAmount();
        return amount.compareTo(min) > 0 && amount.compareTo(max) < 0;
    }

    private AmountFilter(BigDecimal min, BigDecimal max) {
        this.min = min;
        this.max = max;
    }

    private static final Map<String, AmountFilter> CACHE = new ConcurrentHashMap<>();

    /**
     * 获取实例
     * @param min
     * @param max
     * @return
     */
    public static AmountFilter getInstance(final String min, final String max) {
        return CACHE.computeIfAbsent(String.format(FORMAT, min, max),
                key -> new AmountFilter(new BigDecimal(min), new BigDecimal(max)));
    }

}
