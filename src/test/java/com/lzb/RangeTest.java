package com.lzb;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * 区间选择，屏蔽if...else<br/>
 * Created on : 2022-01-12 15:11
 *
 * @author lizebin
 */
public class RangeTest {

    public static void main(String[] args) {
        Range r1 = new Range(0, 5);
        Range r2 = new Range(6, 10);
        Range r3 = new Range(11, 15);
        List<Range> rangeList = Arrays.asList(r1, r2, r3);

        int value = 7;
        Range matchedRange = null;
        for (Range range : rangeList) {
            if (range.inRange(value)) {
                matchedRange = range;
                break;
            }
        }

        System.out.println(matchedRange.max);
    }

    @Data
    @AllArgsConstructor
    private static class Range {
        private int min, max;

        public boolean inRange(int value) {
            return value > min && value < max;
        }
    }

}
