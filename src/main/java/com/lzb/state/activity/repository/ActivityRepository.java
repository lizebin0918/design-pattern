package com.lzb.state.activity.repository;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;

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
    public boolean alterStatus(Long activityId, ActivityState sourceStatus, ActivityState targetStatus) {
        System.out.println("活动：" + activityId + " 更新状态：" + "源状态（" + sourceStatus.getText() + "）->" + "目标状态（" + targetStatus.getText() + "）");
        return true;
    }

    public boolean alterStatus(Activity activity) {
        System.out.println("活动：" + activity.getId()
                + " 更新状态：" + "源状态（" + activity.getOldVersion().getState().getText()
                + "）->" + "目标状态（" + activity.getState().getText() + "）");
        return true;
    }
}
