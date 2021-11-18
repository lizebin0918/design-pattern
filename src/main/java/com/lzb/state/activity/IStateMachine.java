package com.lzb.state.activity;

/**
 * 状态处理接口，对应所有的动作<br/>
 * Created on : 2021-11-07 21:28
 *
 * @author lizebin
 */
public interface IStateMachine {

    /**
     * 提审
     *
     * @param activity 活动聚合根
     */
    void arraignment(Activity activity);

    /**
     * 审核通过
     *
     * @param activity 活动聚合根
     */
    void checkPass(Activity activity);

}
