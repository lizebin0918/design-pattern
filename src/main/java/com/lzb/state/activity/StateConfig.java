package com.lzb.state.activity;

import com.lzb.state.activity.event.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StateConfig {

    private ArraignmentState arraignmentState = new ArraignmentState();
    private CloseState closeState = new CloseState();
    private DoingState doingState = new DoingState();
    private EditingState editingState = new EditingState();
    private OpenState openState = new OpenState();
    private PassState passState = new PassState();
    private RefuseState refuseState = new RefuseState();

    protected Map<ActivityState, AbstractState> stateGroup = new ConcurrentHashMap<>();

    public StateConfig() {
        stateGroup.put(ActivityState.ARRAIGNMENT, arraignmentState);
        stateGroup.put(ActivityState.CLOSE, closeState);
        stateGroup.put(ActivityState.DOING, doingState);
        stateGroup.put(ActivityState.EDIT, editingState);
        stateGroup.put(ActivityState.OPEN, openState);
        stateGroup.put(ActivityState.PASS, passState);
        stateGroup.put(ActivityState.REFUSE, refuseState);
    }

}