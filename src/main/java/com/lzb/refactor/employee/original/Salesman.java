package com.lzb.refactor.employee.original;

public class Salesman extends Employee {

    public Salesman(int monthlySalary, int commission, int bonus) {
        super(EmployeeType.SALESMAN, monthlySalary, commission, bonus);
    }

    @Override
    public int calcPayAmount() {
        return getMonthlySalary() + getCommission();
    }
}
