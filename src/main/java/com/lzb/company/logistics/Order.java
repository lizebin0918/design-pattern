package com.lzb.company.logistics;

import com.lzb.company.logistics.component.entity.Channel;
import com.lzb.company.logistics.component.entity.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * 订单实体<br/>
 * Created on : 2021-09-27 22:36
 *
 * @author lizebin
 */
@Getter
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
    private Country country;

    /**
     * 渠道:shopify/shopify_us
     */
    private Channel channel;
}
