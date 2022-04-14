package com.lzb.pricinple.ocp.demo1.v1;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果Employee有不同的职位：Manager/Executive，怎么扩展？
 */
public class Program
    {
        public static void main(String[] args)
        {
            List<PersonModel> applicants = List.of
            (
                new PersonModel("Tim", "Corey"),
                new PersonModel("Sue", "Storm"),
                new PersonModel("Nancy", "Roman")
            );

            List<EmployeeModel> employees = new ArrayList<>();

            for (PersonModel person : applicants) {
                employees.add(Accounts.create(person));
            }

            for (EmployeeModel employee : employees) {
                System.out.println(JSON.toJSONString(employee));
            }
        }
    }