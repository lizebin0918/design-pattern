package com.lzb.state.activity;

import com.lzb.state.activity.repository.ActivityRepository;

/**
 * <br/>
 * Created on : 2021-11-11 08:37
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        ActivityRepository activityRepository = new ActivityRepository();

        IStateMachine stateMachine = new StateMachineImpl();

        Activity oldVersion = new Activity();
        oldVersion.setId(1L);
        oldVersion.setState(ActivityState.EDIT);

        Activity activity = new Activity();
        activity.setId(1L);
        activity.setState(ActivityState.EDIT);
        activity.setOldVersion(activity);

        stateMachine.arraignment(activity);

        activityRepository.alterStatus(activity);

    }
}
