package com.lzb.adapter.v2_word_filter;

import com.lzb.adapter.v2_word_filter.adapter.*;

/**
 * <br/>
 * Created on : 2021-05-16 10:43
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        FilterManagement filterManagement = new FilterManagement();
        filterManagement.add(new ASensitiveWordsFilterAdaptor());
        filterManagement.add(new BSensitiveWordsFilterAdaptor());
        filterManagement.add(new CSensitiveWordsFilterAdaptor());
        System.out.println(filterManagement.filter("梁小姐~~~哈哈哈哈"));
    }

}
