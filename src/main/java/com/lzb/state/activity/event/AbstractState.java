package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;

public abstract class AbstractState {

    /**
     * 活动提审
     *
     * @param activity 活动聚合根
     */
    public abstract void arraignment(Activity activity);

    /**
     * 审核通过
     *
     * @param activity 活动聚合根
     */
    public abstract void checkPass(Activity activity);


}