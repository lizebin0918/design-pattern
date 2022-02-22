package com.lzb.factory.v2.impl;

import com.alibaba.fastjson.JSON;
import com.lzb.factory.AwardReq;
import com.lzb.factory.AwardRsp;
import com.lzb.factory.v1.card.IQiYiCardService;
import com.lzb.factory.v2.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    private String queryUserMobile(String uId) {
        return "15200101232";
    }

    @Override
    public AwardRsp sendCommodity(AwardReq req) throws Exception {
        String uId = req.getuId(), bizId = req.getBizId(), commodityId = req.getExtMap().get("commodityId");
        Map<String, String> extMap = req.getExtMap();
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
        return new AwardRsp("0000", "发放成功");
    }
}
