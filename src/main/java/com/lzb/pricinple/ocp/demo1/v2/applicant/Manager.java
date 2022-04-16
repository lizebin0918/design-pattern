package com.lzb.pricinple.ocp.demo1.v2.applicant;

import com.lzb.pricinple.ocp.demo1.v2.account.IAccount;
import com.lzb.pricinple.ocp.demo1.v2.account.ManagerAccount;

public class Manager extends Person {
    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public IAccount getAccount() {
        return new ManagerAccount();
    }
}