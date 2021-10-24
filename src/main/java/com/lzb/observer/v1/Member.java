package com.lzb.observer.v1;

import java.util.Objects;

/**
 * 会员实体<br/>
 * Created on : 2021-06-18 10:16
 *
 * @author chenpi
 */
public class Member {

    private Integer id;
    private String name;
    private String loginName;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
