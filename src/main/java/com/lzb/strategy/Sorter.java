package com.lzb.strategy;

import java.util.*;

/**
 * <br/>
 * Created on : 2021-05-07 00:34
 * @author lizebin
 */
public class Sorter {

    private static final List<SortFactory.SortRange> ranges = new ArrayList<>();
    static {
        ranges.add(new SortFactory.SortRange(0, 200, SortFactory.getSort("insertionSort")));
        ranges.add(new SortFactory.SortRange(200, 500, SortFactory.getSort("mergeSort")));
        ranges.add(new SortFactory.SortRange(500, Integer.MAX_VALUE, SortFactory.getSort("quickSort")));
    }

    /**
     * 通过遍历匹配类型，避免多个地方if-else
     * @param array
     */
    public void sort(int[] array) {
        int size = array.length;
        ISort sort = null;
        for (SortFactory.SortRange range : ranges) {
            if (range.inRange(size)) {
                sort = range.getSort();
                break;
            }
        }
        if (Objects.isNull(sort)) return;
        sort.sort(array);
    }

}
