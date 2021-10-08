package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;
import com.lzb.cider.logistics.RuleContent;
import com.lzb.cider.logistics.component.entity.CountryAndZipCode;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = false)
public class CountryAndZipCodeFilter extends Filter {

    /**
     * 限定国家和邮编集合
     */
    private Set<CountryAndZipCode> countryAndZipCode;

    public CountryAndZipCodeFilter(RuleContent ruleContent) {
        super(ruleContent);
        countryAndZipCode = ruleContent.getCountryAndZipCode();
    }

    @Override
    public boolean doFilter(Order order) {
        return true;
    }

}
