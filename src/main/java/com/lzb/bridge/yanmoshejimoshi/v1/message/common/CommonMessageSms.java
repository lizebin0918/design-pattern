package com.lzb.bridge.yanmoshejimoshi.v1.message.common;

import com.lzb.bridge.yanmoshejimoshi.v1.message.Message;

/**
 * 站内消息<br/>
 * Created on : 2022-04-05 09:20
 *
 * @author lizebin
 */
public class CommonMessageSms implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("使用站内短消息的方式，发送消息 %s %s", message, toUser));
    }
}
