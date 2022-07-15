package com.lzb.company.logistics.component.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * 区间<br/>
 * Created on : 2021-10-07 22:44
 *
 * @author lizebin
 */
@AllArgsConstructor
@Getter
public class Range {

    private BigDecimal min, max;

}
