package com.lzb.cider.order_query.executor;

import com.lzb.cider.order_query.query.OrderQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Set;

/**
 * 基础条件查询oid<br/>
 * Created on : 2021-10-24 22:20
 *
 * @author lizebin
 */
public class QueryOidByBaseQueryExecutor implements IQueryOidExecutor {

    @Override
    public boolean inFilter(OrderQuery orderQuery) {
        return (StringUtils.isNotEmpty(orderQuery.getOid())
                || StringUtils.isNotEmpty(orderQuery.getOrderNumber())
                || StringUtils.isNotBlank(orderQuery.getChannel())
                || Objects.nonNull(orderQuery.getTransactionNumber()));
    }

    @Override
    public Set<Long> listOid(OrderQuery orderQuery) {
        return Set.of(1L, 2L, 3L);
    }

}