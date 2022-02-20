package com.lzb.pricinple.dip.v2;

import com.lzb.pricinple.dip.Student;

import java.util.List;

/**
 * <br/>
 * Created on : 2022-02-20 16:04
 *
 * @author lizebin
 */
public class Class2 {

    public List<Student> getStudent(IGetStudent getStudent, List<Student> students, int count) {
        return getStudent.doGetStudent(students, count);
    }

}
