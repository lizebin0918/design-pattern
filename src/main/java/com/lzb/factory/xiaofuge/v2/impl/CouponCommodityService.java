package com.lzb.factory.xiaofuge.v2.impl;

import com.alibaba.fastjson.JSON;
import com.lzb.factory.xiaofuge.AwardReq;
import com.lzb.factory.xiaofuge.AwardRsp;
import com.lzb.factory.xiaofuge.v1.coupon.CouponResult;
import com.lzb.factory.xiaofuge.v1.coupon.CouponService;
import com.lzb.factory.xiaofuge.v2.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public AwardRsp sendCommodity(AwardReq req) throws Exception {
        String uId = req.getuId(), commodityId = req.getExtMap().get("commodityId"), bizId = req.getBizId();
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(req.getExtMap()));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
        return new AwardRsp("0000", "发送成功");
    }
}
