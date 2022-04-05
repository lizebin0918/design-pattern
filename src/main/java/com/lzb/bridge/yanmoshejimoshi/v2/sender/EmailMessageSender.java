package com.lzb.bridge.yanmoshejimoshi.v2.sender;

/**
 * 邮件发送<br/>
 * Created on : 2022-04-05 22:30
 *
 * @author lizebin
 */
public class EmailMessageSender implements MessageSender {

    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("email 发送消息 %s %s", message, toUser));
    }
}
