package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;
import com.lzb.state.activity.Result;

public class ArraignmentState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        throw new RuntimeException("待审核状态不可重复提审");
    }

    @Override
    public Result checkPass(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.PASS);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动审核通过完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.REFUSE);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动审核拒绝完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.EDIT);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动审核撤销回到编辑中") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result close(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "非拒绝活动不可关闭");
    }

    @Override
    public Result open(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "待审核活动不可执行活动中变更");
    }

}
