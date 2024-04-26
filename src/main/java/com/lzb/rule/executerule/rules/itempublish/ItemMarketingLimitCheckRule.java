package com.lzb.rule.executerule.rules.itempublish;

import com.lzb.rule.executerule.anotation.Rule;
import com.lzb.rule.executerule.entity.LbItem;
import com.lzb.rule.executerule.rules.AbstractRule;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 商品营销互斥校验规则
 */
@Rule(id = "itemMarketingLimitCheckRule", name = "商品发布规则", detail = "商品营销互斥校验规则")
public class ItemMarketingLimitCheckRule extends AbstractRule<LbItem> {

    @Override
    public boolean evaluateConditions(LbItem lbItem) {
        return false;
    }

    @Override
    public Rule getRuleAnnotation() {
        return ItemMarketingLimitCheckRule.class.getAnnotation(Rule.class);
    }

    @Override
    public ItemMarketingLimitCheckRule builder() {
        return (ItemMarketingLimitCheckRule) assembly(new ItemMarketingLimitCheckRule());
    }

    public static ItemMarketingLimitCheckRule build() {
        ItemMarketingLimitCheckRule checkRule = new ItemMarketingLimitCheckRule();
        return checkRule.builder();
    }
}
