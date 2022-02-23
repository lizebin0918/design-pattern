package com.lzb.factory.v2;

import com.alibaba.fastjson.JSON;
import com.lzb.factory.AwardReq;
import com.lzb.factory.AwardRsp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟发奖服务
 */
public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    private StoreFactory storeFactory = new StoreFactory();

    public AwardRsp awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRsp awardRsp = null;
        try {
            logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
            // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            ICommodity couponService = storeFactory.getCommodityService(req.getAwardType());
            return couponService.sendCommodity(req);
        } catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}", req.getuId(), reqJson, e);
            awardRsp = new AwardRsp("0001", e.getMessage());
        }

        return awardRsp;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

}
