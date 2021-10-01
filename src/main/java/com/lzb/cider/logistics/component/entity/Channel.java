package com.lzb.cider.logistics.component.entity;

import java.util.Objects;

/**
 * 物流渠道<br/>
 * Created on : 2021-09-27 23:14
 *
 * @author lizebin
 */
public class Channel {

    private final String name;

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;
        Channel channel = (Channel) o;
        return Objects.equals(name, channel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
