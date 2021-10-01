package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;
import com.lzb.cider.logistics.component.entity.Country;
import com.lzb.cider.logistics.component.entity.ZipCode;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 国家邮编Filter<br/>
 * Created on : 2021-10-01 11:11
 *
 * @author lizebin
 */
public class CountryAndZipCodeRuleFilter extends Filter {

    public static final String NAME = "countryAndZipCodeRule";

    private final Map<Country, Set<ZipCode>> countryZipCodeMap;

    private static final Map<Map<Country, Set<ZipCode>>, CountryAndZipCodeRuleFilter> CACHE = new ConcurrentHashMap<>();

    /**
     * 获取实例
     * @return
     */
    public static CountryAndZipCodeRuleFilter getInstance(Map<Country, Set<ZipCode>> countryZipCodeMap) {
        return CACHE.computeIfAbsent(countryZipCodeMap, key ->  new CountryAndZipCodeRuleFilter(countryZipCodeMap));
    }

    private CountryAndZipCodeRuleFilter(Map<Country, Set<ZipCode>> countryZipCodeMap) {
        this.countryZipCodeMap = countryZipCodeMap;
    }

    @Override
    public boolean doFilter(Order order) {
        Country country = order.getCountry();
        String zipCodeStr = "";
        Set<ZipCode> zipCodeSet = countryZipCodeMap.get(country);
        return (Objects.isNull(zipCodeSet) || zipCodeSet.isEmpty()) || (zipCodeSet.contains(new ZipCode(zipCodeStr)));
    }
}
