package com.lzb.refactor.state_permission;

import lombok.Data;

@Data
public class SystemPermission {
    private SystemProfile profile;
    private SystemUser requestor; 
    private SystemAdmin admin; 
    private boolean isGranted; 
    private String state; 
    public final static String REQUESTED = "REQUESTED"; 
    public final static String CLAIMED = "CLAIMED";
    public final static String GRANTED = "GRANTED"; 
    public final static String DENIED = "DENIED"; 
    
    public SystemPermission(SystemUser requestor, SystemProfile profile) { 
        this.requestor = requestor; 
        this.profile = profile; 
        state = REQUESTED; 
        isGranted = false; 
        notifyAdminOfPermissionRequest(); 
    }

    private void notifyAdminOfPermissionRequest() {
        System.out.println("notifyAdminOfPermissionRequest");
    }

    public void claimedBy(SystemAdmin admin) { 
        if (!state.equals(REQUESTED)) 
            return; 
            
        willBeHandledBy(admin); 
        state = CLAIMED; 
    }

    private void willBeHandledBy(SystemAdmin admin) {
        System.out.println("willBeHandledBy");
    }

    public void deniedBy(SystemAdmin admin) { 
        if (!state.equals(CLAIMED)) 
            return; 
            
        if (!this.admin.equals(admin)) 
            return; 
        
        isGranted = false; 
        state = DENIED; 
        notifyUserOfPermissionRequestResult(); 
    }

    private void notifyUserOfPermissionRequestResult() {
        System.out.println("notifyUserOfPermissionRequestResult");
    }

    public void grantedBy(SystemAdmin admin) { 
        if (!state.equals(CLAIMED)) 
            return; 
            
        if (!this.admin.equals(admin)) 
            return; 
            
        state = GRANTED; 
        isGranted = true; 
        notifyUserOfPermissionRequestResult(); 
    }
}