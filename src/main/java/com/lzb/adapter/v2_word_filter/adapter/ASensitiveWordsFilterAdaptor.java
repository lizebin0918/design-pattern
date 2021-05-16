package com.lzb.adapter.v2_word_filter.adapter;

import com.lzb.adapter.v2_word_filter.ASensitiveWordsFilter;

/**
 * A过滤适配器<br/>
 * Created on : 2021-05-16 10:32
 * @author lizebin
 */
public class ASensitiveWordsFilterAdaptor extends ASensitiveWordsFilter implements ISensitiveWordsFilter {

    @Override
    public String filter(String text) {
        return this.filterPoliticalWords(this.filterSexyWords(text));
    }
}
