package com.lzb.refactor.employee.original;

public class Engineer extends Employee {

    public Engineer(int monthlySalary, int commission, int bonus) {
        super(EmployeeType.ENGINEER, monthlySalary, commission, bonus);
    }

    public int calcPayAmount() {
        return getMonthlySalary();
    }
}
