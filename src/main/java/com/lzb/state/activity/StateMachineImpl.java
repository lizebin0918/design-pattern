package com.lzb.state.activity;

/**
 * 状态处理器，等价于订单实体的行为 <br/>
 * Created on : 2021-11-11 08:38
 *
 * @author lizebin
 */
public class StateMachineImpl extends StateConfig implements IStateMachine {

    @Override
    public void arraignment(Activity activity) {
        stateGroup.get(activity.getState()).arraignment(activity);
    }

    @Override
    public Result checkPass(Long activityId, ActivityState currentStatus) {
        return stateGroup.get(currentStatus).checkPass(activityId, currentStatus);
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityState currentStatus) {
        return stateGroup.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityState currentStatus) {
        return stateGroup.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    @Override
    public Result close(Long activityId, ActivityState currentStatus) {
        return stateGroup.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    @Override
    public Result open(Long activityId, ActivityState currentStatus) {
        return stateGroup.get(currentStatus).open(activityId, currentStatus);
    }

    @Override
    public Result doing(Long activityId, ActivityState currentStatus) {
        return stateGroup.get(currentStatus).doing(activityId, currentStatus);
    }
}
