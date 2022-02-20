package com.lzb.pricinple.dip.v2;

import com.lzb.pricinple.dip.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <br/>
 * Created on : 2022-02-20 16:02
 *
 * @author lizebin
 */
public class GetStudentRandom implements IGetStudent {

    @Override
    public List<Student> doGetStudent(List<Student> students, int count) {
        Collections.shuffle(students);
        return new ArrayList<>(students.subList(0, count));
    }
}
