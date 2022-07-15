package com.lzb.company.order_query.executor;

import com.lzb.company.order_query.query.OrderQuery;

import java.util.Set;

/**
 * 订单oid查询抽象类<br/>
 * Created on : 2021-10-24 22:12
 *
 * @author lizebin
 */
public interface IQueryOidExecutor {

    /**
     * 是否选中了对应的查询条件
     * @param orderQuery
     * @return
     */
    boolean inFilter(OrderQuery orderQuery);

    /**
     * 对应查询条件的查询
     * @param orderQuery
     * @return
     */
    Set<Long> listOid(OrderQuery orderQuery);


}
