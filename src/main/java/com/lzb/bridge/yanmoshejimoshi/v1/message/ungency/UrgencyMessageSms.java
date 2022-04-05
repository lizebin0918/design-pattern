package com.lzb.bridge.yanmoshejimoshi.v1.message.ungency;

/**
 * 站内紧急消息<br/>
 * Created on : 2022-04-05 09:52
 *
 * @author lizebin
 */
public class UrgencyMessageSms implements UrgencyMessaage {

    @Override
    public void send(String message, String toUser) {
        message = "加急-" + message;
        System.out.println(String.format("sms 发送消息 %s to %s", message, toUser));
    }

    @Override
    public void readed(String messageId) {
        System.out.println(String.format( "sms消息已读 %s", messageId));
    }
}
