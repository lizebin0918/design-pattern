package com.lzb.adapter.v2_word_filter;

import com.lzb.adapter.v2_word_filter.adapter.ISensitiveWordsFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器管理类<br/>
 * Created on : 2021-05-16 10:41
 * @author lizebin
 */
public class FilterManagement {

    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void add(ISensitiveWordsFilter filter) {
        filters.add(filter);
    }

    public String filter(String text) {
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }

}
