package com.lzb.bridge.yanmoshejimoshi.v2;

import com.lzb.bridge.yanmoshejimoshi.v2.sender.SmsMessageSender;

/**
 * <br/>
 * Created on : 2023-08-26 20:04
 * @author mac
 */
public class CommonSmsMessageFactory {

    public Message getMessage(String msg, String toUser) {
        return new CommonMessage(new SmsMessageSender());
    }

}
