package com.lzb.company.order_query.executor;

import com.lzb.company.order_query.query.OrderQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

/**
 * sku 查询 oids <br/>
 * Created on : 2021-10-24 22:28
 *
 * @author lizebin
 */
public class QueryOidBySkuCodeExecutor implements IQueryOidExecutor {

    @Override
    public boolean inFilter(OrderQuery orderQuery) {
        return StringUtils.isNotBlank(orderQuery.getSkuCode());
    }

    @Override
    public Set<Long> listOid(OrderQuery orderQuery) {
        return Set.of(1L, 2L, 3L);
    }

}
