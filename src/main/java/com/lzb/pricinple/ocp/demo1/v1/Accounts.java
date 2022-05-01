package com.lzb.pricinple.ocp.demo1.v1;

public class Accounts {

    public static EmployeeModel create(PersonModel person) {
        EmployeeModel output = new EmployeeModel();

        output.setFirstName(person.getFirstName());
        output.setLastName(person.getLastName());
        output.setEmailAddress(person.getFirstName().charAt(0) + person.getLastName() + "@acme.com");

        return output;
    }

}