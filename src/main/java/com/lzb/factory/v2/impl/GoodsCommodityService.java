package com.lzb.factory.v2.impl;

import com.alibaba.fastjson.JSON;
import com.lzb.factory.AwardReq;
import com.lzb.factory.AwardRsp;
import com.lzb.factory.v1.goods.DeliverReq;
import com.lzb.factory.v1.goods.GoodsService;
import com.lzb.factory.v2.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    public AwardRsp sendCommodity(AwardReq req) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(req.getuId()));
        deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
        deliverReq.setSku(req.getExtMap().get("commodityId"));
        deliverReq.setOrderId(req.getBizId());
        deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[实物商品] => {} commodityId：{} {} extMap：{}",
                req.getuId(), req.getExtMap().get("commodityId"), req.getBizId(), JSON.toJSON(req.getExtMap()));
        logger.info("测试结果[实物商品]：{}", isSuccess);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
        return new AwardRsp("0000", "发送成功");
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

}
