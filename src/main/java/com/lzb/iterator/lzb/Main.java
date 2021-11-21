package com.lzb.iterator.lzb;

import java.util.Iterator;

/**
 * <br/>
 * Created on : 2021-11-21 19:28
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        // 公司
        Department d1 = new Department("公司");

        // 一级部门
        Department d2 = new Department("技术中心");
        d1.add(d2);
        Department d3 = new Department("人事中心");
        d1.add(d3);
        Department d4 = new Department("财务中心");
        d1.add(d4);

        // 二级部门
        Department d5 = new Department("工程部");
        d2.add(d5);
        Department d6 = new Department("数据部");
        d2.add(d6);

        Iterator<Department> iterator = d1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

}
