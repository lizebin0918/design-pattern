package com.lzb.cider.order_query.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum OrderQueryStatusEnum {
    /**
     * 全部
     */
    ALL(0, "全部"),
    /**
     * 已下单
     */
    ORDERED(1, "已下单"),
    /**
     * 待发货
     */
    WAITING_DELIVERY(2, "待发货"),
    /**
     * 已发货
     */
    DELIVERED(3, "已发货"),
    /**
     * 已取消
     */
    CANCELED(4, "已取消");

    private Integer status;
    private String statusName;

}
