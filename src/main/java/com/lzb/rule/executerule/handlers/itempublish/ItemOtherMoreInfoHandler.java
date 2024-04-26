package com.lzb.rule.executerule.handlers.itempublish;

import com.lzb.rule.executerule.context.RuleBaseEntity;
import com.lzb.rule.executerule.handlers.IHandler;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/18
 * @Desc : 商品更多处理器...扩展不一一举例
 */
public class ItemOtherMoreInfoHandler implements IHandler<RuleBaseEntity> {

    @Override
    public void onEvent(RuleBaseEntity t) {
        //do your biz logic 做你的业务逻辑
        System.out.println("结合业务,更多的检查处理器");
    }
}