package com.lzb.pricinple.ocp.demo1.v2.account;

import com.lzb.pricinple.ocp.demo1.v2.applicant.Employee;
import com.lzb.pricinple.ocp.demo1.v2.applicant.Person;

public class ManagerAccount implements IAccount {
    public Employee create(Person person) {
        Employee output = new Employee(person.getFirstName(), person.getLastName());
        output.mananger(true);
        return output;
    }
}