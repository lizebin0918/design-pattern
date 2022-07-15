package com.lzb.company.logistics.component.filter;

import com.lzb.company.logistics.Order;
import com.lzb.company.logistics.RuleContent;
import com.lzb.company.logistics.component.entity.CountryAndZipCode;
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
