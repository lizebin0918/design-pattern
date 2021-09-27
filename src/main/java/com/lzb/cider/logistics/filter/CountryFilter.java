package com.lzb.cider.logistics.filter;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * 规则明细<br/>
 * Created on : 2021-09-27 22:45
 *
 * @author lizebin
 */
@AllArgsConstructor
public class CountryFilter extends Filter {

    private List<String> countries;

    @Override
    public boolean doHandler(Order order) {
        return countries.contains(order.getCountry());
    }
}
