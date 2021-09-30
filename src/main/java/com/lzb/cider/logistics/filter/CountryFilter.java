package com.lzb.cider.logistics.filter;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 规则明细<br/>
 * Created on : 2021-09-27 22:45
 *
 * @author lizebin
 */
public class CountryFilter extends Filter {

    private final Set<String> countries;

    private static final Map<Set<String>, CountryFilter> CACHE = new ConcurrentHashMap<>();

    @Override
    public boolean doHandler(Order order) {
        return countries.contains(order.getCountry());
    }

    private CountryFilter(Set<String> countries) {
        this.countries = countries;
    }

    public static CountryFilter getInstance(Set<String> conturies) {
        return CACHE.computeIfAbsent(conturies, CountryFilter::new);
    }

}
