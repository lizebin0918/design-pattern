package com.lzb.cider.logistics.component.filter;

import com.lzb.cider.logistics.Order;
import com.lzb.cider.logistics.component.entity.Channel;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 渠道过滤<br/>
 * Created on : 2021-09-27 22:45
 *
 * @author lizebin
 */
public class ChannelFilter extends Filter {

    public static final String NAME = "channel";

    private final Set<Channel> channels;

    private static final Map<Set<Channel>, ChannelFilter> CACHE = new ConcurrentHashMap<>();

    @Override
    public boolean doFilter(Order order) {
        return channels.contains(order.getChannel());
    }

    private ChannelFilter(Set<Channel> channels) {
        this.channels = channels;
    }

    public static ChannelFilter getInstance(Set<Channel> channels) {
        return CACHE.computeIfAbsent(channels, ChannelFilter::new);
    }
}
