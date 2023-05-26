package com.lzb.composition.word;

import com.alibaba.fastjson.JSON;

/**
 * <br/>
 * Created on : 2023-05-26 10:13
 * @author lizebin
 */
public class Word implements Element {

    private Font font;
    private final String value;

    public Word(Font font, String value) {
        this.font = font;
        this.value = value;
    }

    public Word(String value) {
        this(new Font(20), value);
    }

    @Override
    public void changeFont(Font font) {
        this.font = font;
    }

    @Override
    public void show() {
        System.out.println("word : size = " + font.getSize() + "; value : " + this.value);
    }
}
