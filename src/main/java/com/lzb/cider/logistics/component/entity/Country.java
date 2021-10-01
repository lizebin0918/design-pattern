package com.lzb.cider.logistics.component.entity;

import java.util.Objects;

/**
 * 国家<br/>
 * Created on : 2021-10-01 11:25
 *
 * @author lizebin
 */
public class Country {

    private final String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }
}
