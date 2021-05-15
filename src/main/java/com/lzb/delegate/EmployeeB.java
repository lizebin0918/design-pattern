package com.lzb.delegate;
/**
 * A员工开发A模块<br/>
 * Created on : 2021-05-15 21:36
 * @author lizebin
 */
public class EmployeeB implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("B员工开发:" + command);
    }

}
