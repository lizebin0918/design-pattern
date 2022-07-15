package com.lzb.refactor.employee.original;

public class Manager extends Employee {
    public Manager(int monthlySalary, int commission, int bonus) {
        super(EmployeeType.MANAGER, monthlySalary, commission, bonus);
    }

    @Override
    public int calcPayAmount() {
        return getMonthlySalary() + getBonus();
    }
}
