package com.lzb.cider.logistics.component.entity;

import java.util.Objects;

/**
 * 邮政编码<br/>
 * Created on : 2021-10-01 11:26
 *
 * @author lizebin
 */
public class ZipCode {

    private final String name;

    public ZipCode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZipCode)) return false;
        ZipCode zipCode = (ZipCode) o;
        return Objects.equals(name, zipCode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

}
