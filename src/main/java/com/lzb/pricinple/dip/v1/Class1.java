package com.lzb.pricinple.dip.v1;

import com.lzb.pricinple.dip.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 班级<br/>
 * Created on : 2022-02-20 15:51
 *
 * @author lizebin
 */
public class Class1 {

    /**
     * 随机获取学生
     * @param students
     * @param count
     * @return
     */
    public List<Student> getStudentRandom(List<Student> students, int count) {
        Collections.shuffle(students);
        return new ArrayList<>(students.subList(0, count));
    }

    /**
     * 根据年龄获取学生
     * @param students
     * @param count 前10个
     * @return
     */
    public List<Student> getStudentOrderByAge(List<Student> students, int count) {
        students.sort(Comparator.comparing(Student::getAge));
        return new ArrayList<>(students.subList(0, count));
    }

}
