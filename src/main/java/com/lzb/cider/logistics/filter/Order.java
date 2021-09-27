package com.lzb.cider.logistics.filter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单实体<br/>
 * Created on : 2021-09-27 22:36
 *
 * @author lizebin
 */
@Data
@AllArgsConstructor
public class Order {

    private Integer oid;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 国家
     */
    private String country;

    /**
     * 重量
     */
    private BigDecimal weight;
}
