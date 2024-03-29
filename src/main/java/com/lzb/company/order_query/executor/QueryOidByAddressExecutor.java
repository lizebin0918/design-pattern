package com.lzb.company.order_query.executor;

import com.lzb.company.order_query.query.OrderQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

/**
 * 根据地址查询oid<br/>
 * Created on : 2021-10-24 22:36
 *
 * @author lizebin
 */
public class QueryOidByAddressExecutor implements IQueryOidExecutor {

    @Override
    public boolean inFilter(OrderQuery orderQuery) {
        /*
        过滤收件人
         */
        return StringUtils.isNotBlank(orderQuery.getPhone())
                || StringUtils.isNotBlank(orderQuery.getSignUserName())
                || StringUtils.isNotBlank(orderQuery.getAddress())
                || StringUtils.isNotBlank(orderQuery.getCountry())
                || StringUtils.isNotBlank(orderQuery.getEmail());
    }

    @Override
    public Set<Long> listOid(OrderQuery orderQuery) {
        return Set.of(1L, 2L, 3L);
    }


}
