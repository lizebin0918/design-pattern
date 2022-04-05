package com.lzb.bridge.yanmoshejimoshi.v1.message.ungency;

/**
 * email发送加急消息<br/>
 * Created on : 2022-04-05 15:18
 *
 * @author lizebin
 */
public class UrgencyMessageEmail implements UrgencyMessaage {

    @Override
    public void send(String message, String toUser) {
        message = "加急-" + message;
        System.out.println(String.format("发送email消息 %s 给 %s", message, toUser));
    }

    @Override
    public void readed(String messageId) {
        System.out.println(String.format("email消息 %s 已读", messageId));
    }
}
