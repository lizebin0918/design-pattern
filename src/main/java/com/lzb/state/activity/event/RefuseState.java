package com.lzb.state.activity.event;

import com.lzb.state.activity.ActivityStatus;
import com.lzb.state.activity.Result;

public class RefuseState extends AbstractState {

    @Override
    public Result arraignment(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "已审核状态不可重复提审");
    }

    @Override
    public Result checkPass(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "已审核状态不可重复审核");
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "活动审核拒绝不可重复审核");
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityStatus currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStatus.EDIT);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "撤销审核完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result close(Long activityId, ActivityStatus currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStatus.CLOSE);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动审核关闭完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, ActivityStatus currentState) {
        return Result.buildResult(Result.ERROR_CODE, "审核拒绝不可执行活动为进行中");
    }

}
