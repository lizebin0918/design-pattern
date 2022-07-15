package com.lzb.refactor.employ.original;

public class Employee {

    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(EmployeeType type, int monthlySalary, int commission, int bonus) {
        this.type = type;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    private int getType() {
        return type.getTypeCode();
    }

    public int calcPayAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
