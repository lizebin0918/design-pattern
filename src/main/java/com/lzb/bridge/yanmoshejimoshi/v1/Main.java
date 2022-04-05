package com.lzb.bridge.yanmoshejimoshi.v1;

import com.lzb.bridge.yanmoshejimoshi.v1.message.common.CommonMessageEmail;
import com.lzb.bridge.yanmoshejimoshi.v1.message.common.CommonMessageSms;

/**
 * 实现发送消息
 * 1.消息类型：普通、加急、特急
 * 2.发送消息方式：站内消息、邮件、短信
 *
 * <br/>
 * Created on : 2022-04-04 16:37
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        String messge = "线上出bug了";
        String toUser = "lizebin";

        CommonMessageEmail commonMessageEmail = new CommonMessageEmail();
        CommonMessageSms commonMessageSms = new CommonMessageSms();

        commonMessageEmail.send(messge, toUser);
        commonMessageSms.send(messge, toUser);

    }

}
