package com.lzb.bridge.yanmoshejimoshi.v2;

import com.lzb.bridge.yanmoshejimoshi.v2.sender.MessageSender;

/**
 * 消息发送<br/>
 * Created on : 2022-04-05 22:31
 *
 * @author lizebin
 */
public abstract class Message {

    private final MessageSender messageSender;

    Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(String message, String toUser) {
        messageSender.send(message, toUser);
    }

}
