package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;
import com.lzb.state.activity.Result;

public class CloseState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        throw new RuntimeException("活动关闭不可提审");
    }

    @Override
    public Result checkPass(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动关闭不可审核通过");
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动关闭不可审核拒绝");
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动关闭不可撤销审核");
    }

    @Override
    public Result close(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动关闭不可重复关闭");
    }

    @Override
    public Result open(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.OPEN);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动开启完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result doing(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动关闭不可变更活动中");
    }

}
