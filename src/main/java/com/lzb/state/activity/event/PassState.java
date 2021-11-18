package com.lzb.state.activity.event;

import com.lzb.state.activity.Activity;

public class PassState extends AbstractState {

    @Override
    public void arraignment(Activity activity) {
        throw new RuntimeException("已审核状态不可重复提审");
    }

    @Override
    public void checkPass(Activity activity) {
        throw new RuntimeException("已审核状态不可重复审核");
    }

}
