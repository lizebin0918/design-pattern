package com.lzb.company.order_query.query;

import lombok.Data;

import java.util.Collections;
import java.util.List;


/**
 * 订单表字段查询<br/>
 * Created on : 2021-10-20 14:29
 *
 * @author lizebin
 */
@Data
public class BaseOrderQuery {


    private String oid;

    private String orderNumber;

    private String channel;

    /**
     * @see OrderQueryStatusEnum
     * 订单状态，前端默认传：ALL
     */
    private OrderQueryStatusEnum orderStatusCode = OrderQueryStatusEnum.ALL;

    /**
     * 交易流水号
     */
    private String transactionNumber;

    /**
     * 订单类型：前端提交中文
     */
    private String type;

    /**
     * 如果命中基础条件，查询的结果oid用于排序参照，后续对oid排序，无需重新查数据库
     */
    private List<Long> orderedOidList = Collections.emptyList();

}
