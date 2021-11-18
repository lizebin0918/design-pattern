package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;
import com.lzb.state.activity.Result;

public class PassState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        throw new RuntimeException("已审核状态不可重复提审");
    }

    @Override
    public Result checkPass(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "已审核状态不可重复审核");
    }

    @Override
    public Result checkRefuse(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.REFUSE);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动审核拒绝完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result checkRevoke(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "审核通过不可撤销(可先拒绝审核)");
    }

    @Override
    public Result close(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.CLOSE);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动审核关闭完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, ActivityState currentState) {
        return Result.buildResult(Result.ERROR_CODE, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, ActivityState currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityState.DOING);
        return isSuccess ? Result.buildResult(Result.SUCCESS_CODE, "活动变更活动中完成") : Result.buildErrorResult("活动状态变更失败");
    }

}
