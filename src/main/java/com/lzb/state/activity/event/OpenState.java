package com.lzb.state.activity.event;

import com.lzb.state.activity.ActivityStatus;
import com.lzb.state.activity.Result;

public class OpenState extends AbstractState {

    @Override
    public Result arraignment(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动开启不可提审");
    }

    @Override
    public Result checkPass(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动开启不可审核通过");
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动开启不可审核拒绝");
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动开启不可撤销审核");
    }

    @Override
    public Result close(Long activityId, ActivityStatus currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStatus.CLOSE);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动开启完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动不可重复开启");
    }

    @Override
    public Result doing(Long activityId, ActivityStatus currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStatus.DOING);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动变更活动中完成") : Result.buildErrorResult("活动状态变更失败");
    }

}
