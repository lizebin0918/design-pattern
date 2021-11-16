package com.lzb.state.activity;

/**
 * 状态处理器，等价于订单实体的行为 <br/>
 * Created on : 2021-11-11 08:38
 *
 * @author lizebin
 */
public class StateHandlerImpl extends StateConfig implements IStateHandler {


    @Override
    public Result arraignment(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).arraignment(activityId, currentStatus);
    }

    @Override
    public Result checkPass(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).checkPass(activityId, currentStatus);
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    @Override
    public Result close(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    @Override
    public Result open(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).open(activityId, currentStatus);
    }

    @Override
    public Result doing(Long activityId, ActivityStatus currentStatus) {
        return stateGroup.get(currentStatus).doing(activityId, currentStatus);
    }
}
