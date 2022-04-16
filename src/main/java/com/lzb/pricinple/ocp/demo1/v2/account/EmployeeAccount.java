package com.lzb.pricinple.ocp.demo1.v2.account;

import com.lzb.pricinple.ocp.demo1.v2.applicant.Employee;
import com.lzb.pricinple.ocp.demo1.v2.applicant.Person;

public class EmployeeAccount implements IAccount {

    public Employee create(Person person) {
        return new Employee(person.getFirstName(), person.getLastName());
    }

}