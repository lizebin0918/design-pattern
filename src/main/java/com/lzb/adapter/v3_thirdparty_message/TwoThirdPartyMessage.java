package com.lzb.adapter.v3_thirdparty_message;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 * 第三方消息<br/>
 * Created on : 2022-03-26 12:09
 *
 * @author lizebin
 */
@Getter
@Builder
public class TwoThirdPartyMessage {

    @NonNull
    private String messageId;

    @NonNull
    private String money;

    @NonNull
    private String orderId;

}
