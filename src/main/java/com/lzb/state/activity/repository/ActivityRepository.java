package com.lzb.state.activity.repository;

import com.lzb.state.activity.ActivityStatus;

/**
 * <br/>
 * Created on : 2021-11-07 22:12
 *
 * @author lizebin
 */
public class ActivityRepository {

    /**
     * 变更活动状态
     *
     * @param activityId    活动ID
     * @param sourceStatus   源状态
     * @param targetStatus    目标状态
     * @return              更新结果
     */
    public boolean alterStatus(Long activityId, ActivityStatus sourceStatus, ActivityStatus targetStatus) {
        System.out.println("活动：" + activityId + " 更新状态：" + "源状态（" + sourceStatus.getText() + "）->" + "目标状态（" + targetStatus.getText() + "）");
        return true;
    }

}
