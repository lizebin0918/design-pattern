package com.lzb.company.order_query.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【非】订单表字段查询<br/>
 * Created on : 2021-10-20 14:55
 *
 * @author lizebin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderQuery extends BaseOrderQuery {

    /*--------------------------商品相关---------------------*/

    /**
     * skuCode
     */
    private String skuCode;

    /*--------------------------收件人相关---------------------*/

    /**
     * 手机号
     */
    private String phone;
    /**
     * 姓名
     */
    private String signUserName;

    /**
     * 地址
     */
    private String address;

    /**
     * 国家筛选
     */
    private String country;
    /**
     * 邮箱
     */
    private String email;

    /*-------------------包裹相关---------------------*/

    /**
     * 跟踪号：物流单号 or 尾程号
     */
    private String trackNumber;

    /**
     * 包裹号
     */
    private String packageId;

}
