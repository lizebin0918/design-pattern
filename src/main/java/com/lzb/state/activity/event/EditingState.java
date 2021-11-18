package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;
import com.lzb.state.activity.Result;

public class EditingState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        activity.setState(ActivityState.ARRAIGNMENT);
        System.out.println("活动提审成功");
    }

    @Override
    public Result checkPass(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "编辑中不可审核通过");
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "编辑中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "编辑中不可撤销审核");
    }

    @Override
    public Result close(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.CLOSE);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动关闭成功") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "编辑中活动不可执行活动中变更");
    }

}
