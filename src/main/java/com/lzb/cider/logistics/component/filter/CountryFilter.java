package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 国家过滤<br/>
 * Created on : 2021-09-27 22:45
 *
 * @author lizebin
 */
public class CountryFilter extends Filter {

    public static final String NAME = "country";

    private final Set<String> countries;

    private static final Map<Set<String>, CountryFilter> CACHE = new ConcurrentHashMap<>();

    @Override
    public boolean doFilter(Order order) {
        return countries.contains(order.getCountry());
    }

    private CountryFilter(Set<String> countries) {
        this.countries = countries;
    }

    public static CountryFilter getInstance(Set<String> conturies) {
        return CACHE.computeIfAbsent(conturies, CountryFilter::new);
    }

}
