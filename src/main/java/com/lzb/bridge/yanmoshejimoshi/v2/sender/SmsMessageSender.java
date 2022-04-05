package com.lzb.bridge.yanmoshejimoshi.v2.sender;

/**
 * 站内消息<br/>
 * Created on : 2022-04-05 22:29
 *
 * @author lizebin
 */
public class SmsMessageSender implements MessageSender {

    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("站内消息 %s %s", message, toUser));
    }
}
