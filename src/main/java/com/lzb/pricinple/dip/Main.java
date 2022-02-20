package com.lzb.pricinple.dip;

import com.alibaba.fastjson.JSON;
import com.lzb.pricinple.dip.v1.Class1;
import com.lzb.pricinple.dip.v2.Class2;
import com.lzb.pricinple.dip.v2.GetStudentByAge;
import com.lzb.pricinple.dip.v2.GetStudentRandom;

import java.util.ArrayList;
import java.util.List;

/**
 * 依赖倒置，抽象不应该依赖于细节，细节应该依赖于抽象<br/>
 * Created on : 2022-02-20 16:05
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("lizebin", 18));
        studentList.add(new Student("lzb", 20));
        studentList.add(new Student("lzb21", 21));
        studentList.add(new Student("lzb15", 15));

        Class1 class1 = new Class1();
        System.out.println(JSON.toJSONString(class1.getStudentRandom(studentList, 2)));
        System.out.println(JSON.toJSONString(class1.getStudentOrderByAge(studentList, 2)));

        Class2 class2 = new Class2();
        System.out.println(JSON.toJSONString(class2.getStudent(new GetStudentByAge(), studentList, 2)));
        System.out.println(JSON.toJSONString(class2.getStudent(new GetStudentRandom(), studentList, 2)));

    }

}
