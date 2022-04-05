package com.lzb.bridge.yanmoshejimoshi.v2.sender;

/**
 * 发送消息<br/>
 * Created on : 2022-04-05 22:26
 *
 * @author lizebin
 */
public interface MessageSender {

    /**
     * 发送消息
     * @param message
     * @param toUser
     */
    void send(String message, String toUser);

}
