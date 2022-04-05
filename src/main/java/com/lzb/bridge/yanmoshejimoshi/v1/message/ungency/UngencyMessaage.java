package com.lzb.bridge.yanmoshejimoshi.v1.message.ungency;

import com.lzb.bridge.yanmoshejimoshi.v1.message.Message;

/**
 * <br/>
 * Created on : 2022-04-05 09:25
 *
 * @author lizebin
 */
public interface UngencyMessaage extends Message {

    /**
     * 加急消息需要关注【是否已读】
     * @param messageId
     */
    void readed(String messageId);

}
