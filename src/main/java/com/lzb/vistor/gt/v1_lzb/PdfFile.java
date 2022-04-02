package com.lzb.vistor.gt.v1_lzb;

/**
 * <br/>
 * Created on : 2021-10-14 08:38
 *
 * @author lizebin
 */
public class PdfFile  extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("提取pdf文件");
    }

    @Override
    public void zip() {
        System.out.println("压缩PDF文件");
    }
}
