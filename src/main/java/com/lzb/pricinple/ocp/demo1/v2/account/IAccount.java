package com.lzb.pricinple.ocp.demo1.v2.account;

import com.lzb.pricinple.ocp.demo1.v2.applicant.Employee;
import com.lzb.pricinple.ocp.demo1.v2.applicant.Person;

public interface IAccount {
    Employee create(Person person);
}