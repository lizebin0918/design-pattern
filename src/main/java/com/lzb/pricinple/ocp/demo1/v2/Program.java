package com.lzb.pricinple.ocp.demo1.v2;

import com.alibaba.fastjson.JSON;
import com.lzb.pricinple.ocp.demo1.v2.applicant.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Employee("zebin", "li"),
                new Manager("xiaolei", "wang"),
                new Executive("hang", "wen")
        );

        List<Employee> employees = new ArrayList<>();

        for (Person person : persons) {
            employees.add(person.getAccount().create(person));
        }

        for (Employee employee : employees) {
            System.out.println(JSON.toJSONString(employee));
        }

    }
}