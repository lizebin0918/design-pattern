package com.lzb.cider.logistics;

import com.lzb.cider.logistics.component.filter.FilterChainFactory;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 规则<br/>
 * Created on : 2021-09-27 22:41
 *
 * @author lizebin
 */
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Rule {

    /**
     * 标题
     */
    private final String title;

    /**
     * 优先级
     */
    private final Integer priority;

    /**
     * 物流渠道
     */
    private final RuleContent ruleContent;

    public boolean doFilter(Order order) {
        return FilterChainFactory.createFilterChain(ruleContent).doFilter(order);
    }

    /**
     * 匹配结果
     */
    private final String result;

}
