package com.lzb.cider.order_query.executor;

import com.lzb.cider.order_query.query.OrderQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

/**
 * 根据包裹相关字段查询oid<br/>
 * Created on : 2021-12-02 10:23
 *
 * @author lizebin
 */
public class QueryOidByPackageExecutor implements IQueryOidExecutor {

    @Override
    public boolean inFilter(OrderQuery orderQuery) {
        return StringUtils.isNotBlank(orderQuery.getPackageId());
    }

    @Override
    public Set<Long> listOid(OrderQuery orderQuery) {
        return Set.of(1L, 2L, 3L);
    }
}
