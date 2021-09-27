package com.lzb.cider.logistics.filter;

import java.util.List;

/**
 * 规则<br/>
 * Created on : 2021-09-27 22:41
 *
 * @author lizebin
 */
public class Rule {

    /**
     * 标题
     */
    private final String title;

    /**
     * 优先级
     */
    private final Integer priority;

    /**
     * 物流渠道
     */
    private final List<Channel> channelList;

    public Rule(String title, Integer priority, List<Channel> channelList) {
        this.title = title;
        this.priority = priority;
        this.channelList = channelList;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPriority() {
        return priority;
    }

    public List<Channel> getChannelList() {
        return channelList;
    }

    private Filter head, tail;

    public void add(Filter handler) {
        if (head == null && tail == null) {
            head = tail = handler;
        } else {
            tail.setNext(handler);
            tail = handler;
        }
    }

    public boolean handler(Order order) {
        if (head != null) {
            return head.handle(order);
        }
        return true;
    }

}
