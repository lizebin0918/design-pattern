package com.lzb.rule.executerule.handlers.itempublish;

import com.lzb.rule.executerule.context.RuleBaseEntity;
import com.lzb.rule.executerule.handlers.IHandler;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/18
 * @Desc : 商品标题处理器
 */
public class ItemTitleSensitiveRiskHandler implements IHandler<RuleBaseEntity> {

    @Override
    public void onEvent(RuleBaseEntity t) {
        //do your biz logic 做你的业务逻辑
        System.out.println("风控检查商品标题是否含有敏感词");
    }
}
