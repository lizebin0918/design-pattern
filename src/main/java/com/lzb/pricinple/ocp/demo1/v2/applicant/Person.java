package com.lzb.pricinple.ocp.demo1.v2.applicant;

import com.lzb.pricinple.ocp.demo1.v2.account.IAccount;
import lombok.Getter;

@Getter
public abstract class Person {

    private String firstName;
    private String lastName;
    private boolean isMananger = false;
    private boolean isExecutive = false;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract IAccount getAccount();

    public void mananger(boolean isMananger) {
        this.isMananger = isMananger;
    }

    public void executive(boolean isExecutive) {
        this.isExecutive = isExecutive;
    }
}