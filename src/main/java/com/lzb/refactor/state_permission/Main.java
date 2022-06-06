package com.lzb.refactor.state_permission;

/**
 * <br/>
 * Created on : 2022-05-31 11:34
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        SystemUser user = new SystemUser();
        SystemProfile systemProfile = new SystemProfile();
        SystemPermission permission = new SystemPermission(user, systemProfile);
        SystemAdmin admin1 = new SystemAdmin();
        permission.setAdmin(admin1);
        SystemAdmin admin = new SystemAdmin();
        permission.grantedBy(admin);
        permission.claimedBy(admin);
        permission.grantedBy(admin);
    }

}
