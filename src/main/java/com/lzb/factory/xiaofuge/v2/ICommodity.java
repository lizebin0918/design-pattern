package com.lzb.factory.xiaofuge.v2;

import com.lzb.factory.xiaofuge.AwardReq;
import com.lzb.factory.xiaofuge.AwardRsp;

public interface ICommodity {

    AwardRsp sendCommodity(AwardReq req) throws Exception;

}