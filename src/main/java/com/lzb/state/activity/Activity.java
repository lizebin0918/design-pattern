package com.lzb.state.activity;

import lombok.Data;

/**
 * 活动聚合根，对于状态+动作Event形成一个二维表<br/>
 * Created on : 2021-11-07 21:29
 *
 * @author lizebin
 */
@Data
public class Activity {

    /**
     * 原镜像
     */
    private Activity oldVersion;

    /**
     * 活动id
     */
    private Long id;

    /**
     * 活动状态
     */
    private ActivityState state;

}
