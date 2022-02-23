package com.lzb.factory.v2;

import com.lzb.factory.v2.impl.CardCommodityService;
import com.lzb.factory.v2.impl.CouponCommodityService;
import com.lzb.factory.v2.impl.GoodsCommodityService;

public class StoreFactory {

    /**
     * 奖品类型方式实例化
     * @param commodityType 奖品类型
     * @return              实例化对象
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的奖品服务类型");
    }
}