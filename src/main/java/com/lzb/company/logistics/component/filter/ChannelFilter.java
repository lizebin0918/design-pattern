package com.lzb.company.logistics.component.filter;

import com.lzb.company.logistics.Order;
import com.lzb.company.logistics.RuleContent;
import com.lzb.company.logistics.component.entity.Channel;
import lombok.EqualsAndHashCode;

import java.util.Objects;
import java.util.Set;

/**
 * 渠道过滤<br/>
 * Created on : 2021-09-27 22:45
 *
 * @author lizebin
 */
@EqualsAndHashCode(callSuper = false)
public class ChannelFilter extends Filter {

    private final Set<Channel> channels;

    public ChannelFilter(RuleContent ruleContent) {
        super(ruleContent);
        channels = ruleContent.getChannels();
    }

    @Override
    public boolean doFilter(Order order) {
        if (Objects.isNull(channels)) {
            return true;
        }
        return channels.contains(order.getChannel());
    }

}
