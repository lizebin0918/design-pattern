package com.lzb.cider.order_query.executor;

import com.lzb.cider.order_query.query.OrderQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

/**
 * 物流相关字段查询<br/>
 * Created on : 2021-12-02 14:07
 *
 * @author lizebin
 */
public class QueryOidByLogisticsExecutor implements IQueryOidExecutor {

    @Override
    public boolean inFilter(OrderQuery orderQuery) {
        return StringUtils.isNotEmpty(orderQuery.getTrackNumber());
    }

    @Override
    public Set<Long> listOid(OrderQuery orderQuery) {
        return Set.of(1L, 2L, 3L);
    }
}
