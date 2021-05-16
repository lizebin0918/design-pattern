package com.lzb.adapter.v2_word_filter;
/**
 * A服务的敏感词过滤<br/>
 * Created on : 2021-05-16 10:09
 * @author lizebin
 */
public class ASensitiveWordsFilter {

    public String filterSexyWords(String text) {
        System.out.println("A 过滤色情敏感词");
        return text;
    }

    public String filterPoliticalWords(String text) {
        System.out.println("A 过滤政治敏感词");
        return text;
    }

}
