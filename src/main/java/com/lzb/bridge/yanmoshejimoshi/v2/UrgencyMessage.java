package com.lzb.bridge.yanmoshejimoshi.v2;

import com.lzb.bridge.yanmoshejimoshi.v2.sender.MessageSender;

/**
 * 加急消息<br/>
 * Created on : 2022-04-05 22:37
 *
 * @author lizebin
 */
public class UrgencyMessage extends AbstractMessage {

    UrgencyMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message, String toUser) {
        message += "加急-" + message;
        super.send(message, toUser);
    }

    public void readed(String messageId) {
        System.out.println(String.format( "sms消息已读 %s", messageId));
    }
}
