package com.lzb.bridge.yanmoshejimoshi.v2;

import com.lzb.bridge.yanmoshejimoshi.v2.sender.MessageSender;

/**
 * 特急消息<br/>
 * Created on : 2022-04-05 22:39
 *
 * @author lizebin
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    SpecialUrgencyMessage(MessageSender messageSender) {
        super(messageSender);
    }

    public void hurry(String messageId) {}

    @Override
    public void send(String message, String toUser) {
        message += "特急-" + message;
        super.send(message, toUser);
    }
}
