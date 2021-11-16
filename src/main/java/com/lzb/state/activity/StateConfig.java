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

    protected Map<ActivityStatus, AbstractState> stateGroup = new ConcurrentHashMap<>();

    public StateConfig() {
        stateGroup.put(ActivityStatus.ARRAIGNMENT, arraignmentState);
        stateGroup.put(ActivityStatus.CLOSE, closeState);
        stateGroup.put(ActivityStatus.DOING, doingState);
        stateGroup.put(ActivityStatus.EDIT, editingState);
        stateGroup.put(ActivityStatus.OPEN, openState);
        stateGroup.put(ActivityStatus.PASS, passState);
        stateGroup.put(ActivityStatus.REFUSE, refuseState);
    }

}