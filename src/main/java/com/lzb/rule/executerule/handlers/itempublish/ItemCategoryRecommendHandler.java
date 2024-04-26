package com.lzb.rule.executerule.handlers.itempublish;

import com.lzb.rule.executerule.context.RuleBaseEntity;
import com.lzb.rule.executerule.handlers.IHandler;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/18
 * @Desc : 商品类目处理器
 */
public class ItemCategoryRecommendHandler implements IHandler<RuleBaseEntity> {

    @Override
    public void onEvent(RuleBaseEntity order) {
        //do your biz logic 做你的业务逻辑
        System.out.println("检查商品类目推荐匹配");
    }
}
