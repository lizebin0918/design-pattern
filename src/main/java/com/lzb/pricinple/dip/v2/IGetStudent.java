package com.lzb.pricinple.dip.v2;

import com.lzb.pricinple.dip.Student;

import java.util.List;

/**
 * <br/>
 * Created on : 2022-02-20 16:01
 *
 * @author lizebin
 */
public interface IGetStudent {

    List<Student> doGetStudent(List<Student> students, int count);

}
