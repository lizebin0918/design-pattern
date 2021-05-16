package com.lzb.adapter.v2_word_filter.adapter;

import com.lzb.adapter.v2_word_filter.CSensitiveWordsFilter;

/**
 * C敏感词过滤<br/>
 * Created on : 2021-05-16 10:39
 * @author lizebin
 */
public class CSensitiveWordsFilterAdaptor extends CSensitiveWordsFilter implements ISensitiveWordsFilter {

    @Override
    public String filter(String text) {
        return super.filter(text, "*******");
    }
}
