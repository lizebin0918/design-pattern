package com.lzb.rule.executerule.rules.itempublish;

import com.lzb.rule.executerule.anotation.Rule;
import com.lzb.rule.executerule.entity.LbItem;
import com.lzb.rule.executerule.rules.AbstractRule;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 商品库存限购校验规则
 */
@Rule(id = "itemStockNumQuotaCheckRule", name = "商品发布规则", detail = "商品库存限购校验规则")
public class ItemStockNumQuotaCheckRule extends AbstractRule<LbItem> {

    @Override
    public boolean evaluateConditions(LbItem lbItem) {
        return true;
    }

    @Override
    public Rule getRuleAnnotation() {
        return ItemStockNumQuotaCheckRule.class.getAnnotation(Rule.class);
    }

    @Override
    public ItemStockNumQuotaCheckRule builder() {
        return (ItemStockNumQuotaCheckRule) assembly(new ItemStockNumQuotaCheckRule());
    }

    public static ItemStockNumQuotaCheckRule build() {
        ItemStockNumQuotaCheckRule checkRule = new ItemStockNumQuotaCheckRule();
        return checkRule.builder();
    }
}
