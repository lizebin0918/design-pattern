package com.lzb.iterator.gt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试jdk迭代器<br/>
 * Created on : 2021-10-12 08:38
 *
 * @author lizebin
 */
public class TestJdkIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(2);
        Iterator<Integer> i1 = list.iterator();
        list.remove(Integer.valueOf(2));
        System.out.println(list);
        Iterator<Integer> i2 = list.iterator();
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        test(Integer.valueOf(1));
    }

    public static void test(int i) {
        System.out.println("int");
    }

    public static void test(Object i) {
        System.out.println("object");
    }

}
