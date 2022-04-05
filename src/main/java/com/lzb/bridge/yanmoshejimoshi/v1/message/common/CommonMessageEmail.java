package com.lzb.bridge.yanmoshejimoshi.v1.message.common;

import com.lzb.bridge.yanmoshejimoshi.v1.message.Message;

/**
 * 邮件消息<br/>
 * Created on : 2022-04-05 09:23
 *
 * @author lizebin
 */
public class CommonMessageEmail implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("使用E-mail方式发送 %s to %s", message, toUser));
    }
}
