package com.lzb.vistor.gt.v1_lzb;

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

    @Override
    public void zip() {
        System.out.println("压缩PPT文件");
    }
}
