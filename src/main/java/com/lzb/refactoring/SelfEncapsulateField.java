package com.lzb.refactoring;

/**
 * 封装<br/>
 * Created on : 2022-07-08 10:00
 *
 * @author lizebin
 */
public class SelfEncapsulateField {

    static class Range {
        private int low, high;
        boolean includes(int arg) {
            return arg >= low && arg <= high;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////

    class Range1 {
        private int low, high;
        boolean includes(int arg) {
            return arg >= getLow() && arg <= getHigh();
        }
        int getLow() {
            return low;
        }
        int getHigh() {
            return high;
        }
    }

}
