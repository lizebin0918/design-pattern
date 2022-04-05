package com.lzb.bridge.yanmoshejimoshi.v2;

import com.lzb.bridge.yanmoshejimoshi.v2.sender.EmailMessageSender;
import com.lzb.bridge.yanmoshejimoshi.v2.sender.SmsMessageSender;

/**
 * 通过 对下游接口的依赖，实现上下游解耦<br/>
 * Created on : 2022-04-05 22:25
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        // 普通消息采用站内消息
        SmsMessageSender smsMessageSender = new SmsMessageSender();
        AbstractMessage commonMessage = new CommonMessage(smsMessageSender);
        commonMessage.send("你好", "lizebin");

        // 加急消息采用邮件
        EmailMessageSender emailMessageSender = new EmailMessageSender();
        UrgencyMessage urgencyMessaage = new UrgencyMessage(emailMessageSender);
        urgencyMessaage.send("线上出bug了", "lizebin");

    }

}
