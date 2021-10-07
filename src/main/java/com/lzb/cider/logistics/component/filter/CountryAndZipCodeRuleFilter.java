package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;
import com.lzb.cider.logistics.RuleContent;
import com.lzb.cider.logistics.component.entity.CountryAndZipCode;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = false)
public class CountryAndZipCodeRuleFilter extends Filter {

    /**
     * 限定国家和邮编集合
     */
    private Set<CountryAndZipCode> countryAndZipCodes;

    public CountryAndZipCodeRuleFilter(RuleContent ruleContent) {
        super(ruleContent);
        countryAndZipCodes = ruleContent.getCountryAndZipCodes();
    }

    @Override
    public boolean doFilter(Order order) {
        return false;
    }

}
