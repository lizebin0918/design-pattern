package com.lzb.rule.executerule.context;

import java.io.Serializable;

import lombok.Data;


/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 规则实体基类
 */
@Data
public class RuleBaseEntity implements Serializable {

    /**
     * 实体id
     */
    private Long entityId;
}
