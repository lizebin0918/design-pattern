package com.lzb.state.activity;

import com.lzb.state.activity.event.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StateConfig {

    private ArraignmentState arraignmentState = new ArraignmentState();
    private EditingState editingState = new EditingState();
    private PassState passState = new PassState();

    protected Map<ActivityState, AbstractState> stateGroup = new ConcurrentHashMap<>();

    public StateConfig() {
        stateGroup.put(ActivityState.ARRAIGNMENT, arraignmentState);
        stateGroup.put(ActivityState.EDIT, editingState);
        stateGroup.put(ActivityState.PASS, passState);
    }

}