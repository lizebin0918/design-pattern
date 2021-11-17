package com.lzb.composition.rule.model;

import lombok.Data;

/**
 * 用户<br/>
 * Created on : 2021-11-17 20:20
 *
 * @author lizebin
 */
@Data
public class User {

    /**
     * 用户id
     */
    private String id;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

}
