package com.lzb.cider.order_query.new_executor;

import lombok.AllArgsConstructor;

import java.util.Set;
import java.util.function.Supplier;

/**
 * <br/>
 * Created on : 2022-03-26 21:47
 *
 * @author lizebin
 */
@AllArgsConstructor
public class QueryOidExecutorWrapper {

    private Supplier<Set<Long>> queryOid;

    public Set<Long> queryOid() {
        return queryOid.get();
    }

}
