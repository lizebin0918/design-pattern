package com.lzb.rule.executerule.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author :
 * @Time : 2022/8/20 16:01
 * @desc : 
 */
@Data
public class LbItem implements Serializable {
    private Long itemId;
    private String itemTitle;
    private Long itemBasicPrice;
    private Long itemMarketingPrice;
    private Integer itemStockNum;
}