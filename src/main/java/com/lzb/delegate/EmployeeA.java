package com.lzb.delegate;
/**
 * A员工开发A模块<br/>
 * Created on : 2021-05-15 21:36
 * @author lizebin
 */
public class EmployeeA implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("A员工开发:" + command);
    }

}
