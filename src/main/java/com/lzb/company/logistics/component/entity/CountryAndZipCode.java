package com.lzb.company.logistics.component.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Set;

@AllArgsConstructor
@EqualsAndHashCode
public class CountryAndZipCode {

    String country;
    /**
     * 如果是前缀匹配就 **1234
     * 如果是后缀匹配就 1234**
     * 如果是指定的 就不需要加**
     */
    Set<String> zipCodes;

}
