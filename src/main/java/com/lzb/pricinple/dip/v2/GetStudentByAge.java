package com.lzb.pricinple.dip.v2;

import com.lzb.pricinple.dip.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <br/>
 * Created on : 2022-02-20 16:03
 *
 * @author lizebin
 */
public class GetStudentByAge implements IGetStudent {

    @Override
    public List<Student> doGetStudent(List<Student> students, int count) {
        students.sort(Comparator.comparing(Student::getAge));
        return new ArrayList<>(students.subList(0, count));
    }
}
