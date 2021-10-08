package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;
import com.lzb.cider.logistics.RuleContent;
import com.lzb.cider.logistics.component.entity.Country;
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
