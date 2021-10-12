package com.lzb.iterator.gt;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 实现快照迭代，当List进行CRUD的时候，并不会影响迭代器的数据<br/>
 * Created on : 2021-10-12 09:55
 *
 * @author lizebin
 */
public class MySnapshotIteratorListV1 {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.remove(0);
        }
        System.out.println(JSON.toJSONString(list));
    }

    private static class MyArrayList<T> extends ArrayList<T> {

        @Override
        public Iterator<T> iterator() {
            return new SnapshotArrayIterator<>(this);
        }
    }

    private static class SnapshotArrayIterator<T> implements Iterator<T> {

        private int cursor;
        private final ArrayList<T> snapshotList;
        public SnapshotArrayIterator(ArrayList<T> list) {
            this.snapshotList = new ArrayList<>(list);
        }

        @Override
        public boolean hasNext() {
            return cursor < snapshotList.size();
        }

        @Override
        public T next() {
            return snapshotList.get(cursor++);
        }
    }

}
