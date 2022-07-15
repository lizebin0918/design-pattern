package com.lzb.company.logistics.component.filter;

import com.lzb.company.logistics.Order;
import com.lzb.company.logistics.RuleContent;
import com.lzb.company.logistics.component.entity.Country;
import lombok.EqualsAndHashCode;

import java.util.Objects;
import java.util.Set;

/**
 * 国家过滤<br/>
 * Created on : 2021-09-27 22:45
 *
 * @author lizebin
 */
@EqualsAndHashCode(callSuper = false)
public class CountryFilter extends Filter {

    private Set<Country> countries;

    public CountryFilter(RuleContent ruleContent) {
        super(ruleContent);
        countries = ruleContent.getCountries();
    }

    @Override
    public boolean doFilter(Order order) {
        if (Objects.isNull(countries)) {
            return true;
        }
        return countries.contains(order.getCountry());
    }

}
