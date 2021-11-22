package com.lzb.iterator.lzb;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 部门<br/>
 * Created on : 2021-11-21 17:18
 *
 * @author lizebin
 */
@Data
public class Department {

    public Department(String name) {
        this.name = name;
    }

    private String name;

    /**
     * 子部门列表
     */
    private List<Department> departmentList = new ArrayList<>();

    /**
     * 添加子部门
     * @param department
     * @return
     */
    public boolean add(Department department) {
        return departmentList.add(department);
    }

    /**
     * 迭代器
     * @return
     */
    public Iterator<Department> iterator() {
        return new PreOrderIterator(this);
    }

    /**
     * 前序遍历
     * @param department
     * @param list 存放遍历结果
     */
    public void preOrder(Department department, List<Department> departmentList) {
        departmentList.add(department);
        department.getDepartmentList().forEach(child -> preOrder(child, departmentList));
    }

}
