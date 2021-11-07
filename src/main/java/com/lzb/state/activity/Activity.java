package com.lzb.state.activity;

import lombok.Data;

/**
 * 活动实体，对于状态+动作Event形成一个二维表<br/>
 * Created on : 2021-11-07 21:29
 *
 * @author lizebin
 */
@Data
public class Activity {

    /**
     * 活动id
     */
    private Long activityId;
    /**
     * 活动状态
     */
    private ActivityStatus activityStatus;

}
