package com.lzb.pricinple.ocp.demo1.v2.applicant;

import com.lzb.pricinple.ocp.demo1.v2.account.EmployeeAccount;
import com.lzb.pricinple.ocp.demo1.v2.account.IAccount;
import lombok.Getter;

@Getter
public class Employee extends Person {

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public IAccount getAccount() {
        return new EmployeeAccount();
    }

}