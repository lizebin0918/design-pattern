package com.lzb.adapter.v3_thirdparty_message;

import lombok.Data;

/**
 * 标准消息<br/>
 * Created on : 2022-03-26 12:05
 *
 * @author lizebin
 */
@Data
public class StandardMessage {

    public static final String MSG_ID = "msgId";

    public static final String THIRD_PARTY_MSG_ID = "thirdPartyMsgId";

    public static final String ORDER_NO = "orderNo";

    public static final String PAY_MONEY = "payMoney";

    private String msgId;

    private String thirdPartyMsgId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 支付金额
     */
    private String payMoney;

}
