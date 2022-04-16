package com.lzb.pricinple.ocp.demo1.v2.account;

import com.lzb.pricinple.ocp.demo1.v2.applicant.Employee;
import com.lzb.pricinple.ocp.demo1.v2.applicant.Person;

public class ExecutiveAccount implements IAccount {
    public Employee create(Person person) {
        Employee employee = new Employee(person.getFirstName(), person.getLastName());
        employee.mananger(true);
        employee.executive(true);
        return employee;
    }
}