package com.lzb.adapter.v3_thirdparty_message;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import static com.lzb.adapter.v3_thirdparty_message.StandardMessage.*;

/**
 * <br/>
 * Created on : 2022-03-26 15:46
 *
 * @author lizebin
 */
@Slf4j
public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {

        OneThirdPartyMessage oneMessage = OneThirdPartyMessage.builder()
                .msgId(UUID.randomUUID().toString())
                .oid("123")
                .shouldPayMoney(BigDecimal.TEN)
                .build();
        log.info("oneMessage {}", JSON.toJSONString(oneMessage));

        TwoThirdPartyMessage twoMessage = TwoThirdPartyMessage.builder().messageId(UUID.randomUUID().toString())
                .orderId("456")
                .money("10.0")
                .build();
        log.info("twoMessage {}", JSON.toJSONString(twoMessage));

        StandardMessage oneStandardMessage = MQAdapter.convert(JSON.toJSONString(oneMessage),
                Map.of(MSG_ID, "msgId", PAY_MONEY, "shouldPayMoney", ORDER_NO, "oid"));
        log.info("oneStandardMessage {}", JSON.toJSONString(oneStandardMessage));

        StandardMessage twoStandardMessage = MQAdapter.convert(JSON.toJSONString(twoMessage),
                Map.of(MSG_ID, "messageId",
                        PAY_MONEY, "money",
                        ORDER_NO, "orderId"));
        log.info("twoStandardMessage {}", JSON.toJSONString(twoStandardMessage));

    }

}
