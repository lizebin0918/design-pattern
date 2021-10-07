package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;
import com.lzb.cider.logistics.RuleContent;
import com.lzb.cider.logistics.component.entity.Range;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 金额过滤<br/>
 * Created on : 2021-09-27 23:18
 *
 * @author lizebin
 */
@EqualsAndHashCode(callSuper = false)
public class AmountFilter extends Filter {

    private final Range range;

    public AmountFilter(RuleContent ruleContent) {
        super(ruleContent);
        range = ruleContent.getAmountRange();
    }

    @Override
    public boolean doFilter(Order order) {
        BigDecimal amount = order.getAmount();
        return amount.compareTo(range.getMin()) > 0 && amount.compareTo(range.getMax()) < 0;
    }

}
