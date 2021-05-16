package com.lzb.adapter.v2_word_filter.adapter;
/**
 * 适配器统一接口<br/>
 * Created on : 2021-05-16 10:32
 * @author lizebin
 */
public interface ISensitiveWordsFilter {

    String filter(String text);
    
}
