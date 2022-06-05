package com.lzb.cider.product_query;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * 区间<br/>
 * Created on : 2022-06-05 10:56
 *
 * @author cidervisioncase
 */
@Getter
public class Range {

    private final BigDecimal min;
    private final BigDecimal max;

    public Range(BigDecimal min, BigDecimal max) {
        this.min = min;
        this.max = max;
    }

    /**
     * 匹配区间
     * @param value
     * @return
     */
    public boolean between(BigDecimal value) {
        return value.compareTo(min) >= 0 && value.compareTo(max) <= 0;
    }

}
