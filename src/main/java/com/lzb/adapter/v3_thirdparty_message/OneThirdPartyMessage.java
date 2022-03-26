package com.lzb.adapter.v3_thirdparty_message;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;

/**
 * 第三方消息<br/>
 * Created on : 2022-03-26 12:09
 *
 * @author lizebin
 */
@Getter
@Builder
public class OneThirdPartyMessage {

    @NonNull
    private String msgId;

    @NonNull
    private BigDecimal shouldPayMoney;

    @NonNull
    private String oid;

}
