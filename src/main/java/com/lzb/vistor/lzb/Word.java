package com.lzb.vistor.lzb;

/**
 * <br/>
 * Created on : 2022-05-17 09:58
 *
 * @author lizebin
 */
public class Word implements Text, Zip {

    public String text() {
        System.out.println("this is word text");
        return "word";
    }

    @Override
    public String zip() {
        System.out.println("word zip");
        return "word zip";
    }
}
