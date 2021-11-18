package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;

public class ArraignmentState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        throw new RuntimeException("待审核状态不可重复提审");
    }

    @Override
    public void checkPass(Activity activity) {
        activity.setState(ActivityState.PASS);
        System.out.println("活动审核通过完成");
    }

}
