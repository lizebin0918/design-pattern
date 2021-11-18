package com.lzb.state.activity;

/**
 * 状态处理器，等价于订单实体的行为 <br/>
 * Created on : 2021-11-11 08:38
 *
 * @author lizebin
 */
public class StateMachineImpl extends StateConfig implements IStateMachine {

    @Override
    public void arraignment(Activity activity) {
        stateGroup.get(activity.getState()).arraignment(activity);
    }

    @Override
    public void checkPass(Activity activity) {
        stateGroup.get(activity.getState()).checkPass(activity);
    }

}
