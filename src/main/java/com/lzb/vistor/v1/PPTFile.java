package com.lzb.vistor.v1;

/**
 * <br/>
 * Created on : 2021-10-13 22:59
 *
 * @author lizebin
 */
public class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("抽取PPT文本");
    }
}
