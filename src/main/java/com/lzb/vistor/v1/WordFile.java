package com.lzb.vistor.v1;

/**
 * <br/>
 * Created on : 2021-10-14 08:39
 *
 * @author lizebin
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("提取word");
    }
}
