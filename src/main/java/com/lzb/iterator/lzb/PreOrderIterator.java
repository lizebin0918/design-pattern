package com.lzb.iterator.lzb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * (多叉树)前序遍历迭代器<br/>
 * Created on : 2021-11-21 19:18
 *
 * @author lizebin
 */
public class PreOrderIterator implements Iterator<Department> {

    private int cursor = 0;
    private final List<Department> departmentList = new ArrayList<>();

    public PreOrderIterator(Department department) {
        department.preOrder(department, departmentList);
    }

    @Override
    public boolean hasNext() {
        return cursor < departmentList.size();
    }

    @Override
    public Department next() {
        return departmentList.get(cursor++);
    }
}
