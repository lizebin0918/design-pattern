package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.RuleContent;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 过滤链工厂<br/>
 * Created on : 2021-10-07 22:59
 *
 * @author lizebin
 */
public class FilterChainFactory {

    private static final List<Class<? extends Filter>> FILTER_LIST = new ArrayList<>();

    static {
        FILTER_LIST.add(AmountFilter.class);
        FILTER_LIST.add(ChannelFilter.class);
        FILTER_LIST.add(CountryAndZipCodeFilter.class);
        FILTER_LIST.add(CountryFilter.class);
    }

    /**
     * 创建过滤链
     * @param ruleContent
     * @return 链表头节点
     */
    public static Filter createFilterChain(RuleContent ruleContent) {
        Filter head = null, current = null;

        try {
            // 构建规则所关联的所有Filter
            for (Class<? extends Filter> filterClass : FILTER_LIST) {
                Constructor<? extends Filter> constructor = filterClass.getConstructor(RuleContent.class);
                Filter filter = constructor.newInstance(ruleContent);
                if (Objects.isNull(head)) {
                    current = head = filter;
                } else {
                    current.setNext(filter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("规则生成异常");
        }
        return head;
    }

}
