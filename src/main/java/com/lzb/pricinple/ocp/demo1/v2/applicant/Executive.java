package com.lzb.pricinple.ocp.demo1.v2.applicant;

import com.lzb.pricinple.ocp.demo1.v2.account.ExecutiveAccount;
import com.lzb.pricinple.ocp.demo1.v2.account.IAccount;

/**
 * cto
 */
public class Executive extends Person {

    public Executive(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public IAccount getAccount() {
        return new ExecutiveAccount();
    }
}