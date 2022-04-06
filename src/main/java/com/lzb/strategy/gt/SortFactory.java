package com.lzb.strategy.gt;

import java.util.HashMap;
import java.util.Map;

/**
 * 排序工厂<br/>
 * Created on : 2021-05-07 00:36
 * @author lizebin
 */
public class SortFactory {

    private static final Map<String, ISort> SORTERS = new HashMap<>();

    static {
        SORTERS.put("quickSort", new QuickSort());
        SORTERS.put("insertionSort", new InsertionSort());
        SORTERS.put("mergeSort", new MergeSort());
    }

    public static ISort getSort(String type) {
        return SORTERS.get(type);
    }

    public static class SortRange {
        private long start;
        private long end;
        private ISort sort;

        public SortRange(long start, long end, ISort sort) {
            this.start = start;
            this.end = end;
            this.sort = sort;
        }

        public ISort getSort() {
            return sort;
        }

        public boolean inRange(long size) {
            return size >= start && size < end;
        }
    }
}
