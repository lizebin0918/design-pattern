package com.lzb.refactor.employee.original;

import lombok.Data;

@Data
public abstract class Employee {

    private int type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    Employee(int type, int monthlySalary, int commission, int bonus) {
        this.type = type;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    public abstract int calcPayAmount();

}
