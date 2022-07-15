package com.lzb.refactor.employ;

import com.lzb.refactor.employ.original.Employee;
import com.lzb.refactor.employ.original.Engineer;
import com.lzb.refactor.employ.original.Manager;
import com.lzb.refactor.employ.original.Salesman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    @Test
    void should_return_monthlySalary_when_calcPayAmount_given_engineer() {
        // given
        Employee employee = new Employee(new Engineer(), 30000, 10000, 50000);
        // when
        int payAmount = employee.calcPayAmount();
        // then
        assertEquals(30000, payAmount);
    }

    @Test
    void should_return_monthlySalary_plus_commission_when_calcPayAmount_given_salesman() {
        // given
        Employee employee = new Employee(new Salesman(), 30000, 10000, 50000);
        // when
        int payAmount = employee.calcPayAmount();
        // then
        assertEquals(40000, payAmount);
    }

    @Test
    void should_return_monthlySalary_plus_bonus_when_calcPayAmount_given_manager() {
        // given
        Employee employee = new Employee(new Manager(), 30000, 10000, 50000);
        // when
        int payAmount = employee.calcPayAmount();
        // then
        assertEquals(80000, payAmount);
    }

}