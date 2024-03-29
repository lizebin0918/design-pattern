package com.lzb.company.logistics.component.filter;

import com.lzb.company.logistics.Order;
import com.lzb.company.logistics.RuleContent;
import com.lzb.company.logistics.component.entity.Range;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Objects;

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
        if (Objects.isNull(range)) {
            return true;
        }
        BigDecimal amount = order.getAmount();
        return amount.compareTo(range.getMin()) > 0 && amount.compareTo(range.getMax()) < 0;
    }

}
