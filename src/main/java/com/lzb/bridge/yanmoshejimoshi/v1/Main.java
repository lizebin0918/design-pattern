package com.lzb.bridge.yanmoshejimoshi.v1;

import com.lzb.bridge.yanmoshejimoshi.v1.message.common.CommonMessageEmail;
import com.lzb.bridge.yanmoshejimoshi.v1.message.common.CommonMessageSms;
import com.lzb.bridge.yanmoshejimoshi.v1.message.ungency.UrgencyMessageEmail;
import com.lzb.bridge.yanmoshejimoshi.v1.message.ungency.UrgencyMessageSms;

/**
 * 实现发送消息
 * 1.消息类型：普通、加急(需要在消息全面加前缀：加急-)、特急(需要在消息全面加前缀：特急-)
 * 2.发送消息方式：站内消息、邮件、短信
 *
 * 这样做的问题：
 * 通过继承来实现不同功能的组装，上面3个功能就会有：3*3=9 个类
 *
 * 通过分解 抽象（上游，在这里是 消息类型） + 实现（下游，在这里是 发送消息方式） 两部分，通过接口交互，可以大大降低复杂度
 *
 * <br/>
 * Created on : 2022-04-04 16:37
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        String message = "线上出bug了";
        String toUser = "lizebin";

        CommonMessageEmail commonMessageEmail = new CommonMessageEmail();
        commonMessageEmail.send(message, toUser);

        CommonMessageSms commonMessageSms = new CommonMessageSms();
        commonMessageSms.send(message, toUser);

        UrgencyMessageEmail ungencyMessageEmail = new UrgencyMessageEmail();
        ungencyMessageEmail.send(message, toUser);

        UrgencyMessageSms ungencyMessageSms = new UrgencyMessageSms();
        ungencyMessageSms.send(message, toUser);

    }

}
