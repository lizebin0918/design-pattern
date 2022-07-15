package com.lzb.company.logistics;

import com.lzb.company.logistics.component.entity.Channel;
import com.lzb.company.logistics.component.entity.Country;
import com.lzb.company.logistics.component.entity.CountryAndZipCode;
import com.lzb.company.logistics.component.entity.Range;
import lombok.Data;

import java.util.Set;

@Data
public class RuleContent {

    /**
     * 渠道
     */
    private Set<Channel> channels;

    /**
     * 金额
     */
    private Range amountRange;

    /**
     * 国家邮编
     */
    private Set<CountryAndZipCode> countryAndZipCode;

    /**
     * 国家
     */
    private Set<Country> countries;
}