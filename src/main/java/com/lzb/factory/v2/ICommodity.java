package com.lzb.factory.v2;

import com.lzb.factory.AwardReq;
import com.lzb.factory.AwardRsp;

public interface ICommodity {

    AwardRsp sendCommodity(AwardReq req) throws Exception;

}