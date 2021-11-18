package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;
import com.lzb.state.activity.ActivityState;

public class EditingState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        activity.setState(ActivityState.ARRAIGNMENT);
        System.out.println("活动提审成功");
    }

    @Override
    public void checkPass(Activity activity) {
        throw new RuntimeException("编辑中不可审核通过");
    }

}
