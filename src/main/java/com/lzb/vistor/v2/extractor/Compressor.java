package com.lzb.vistor.v2.extractor;

import com.lzb.vistor.v2.PPTFile;
import com.lzb.vistor.v2.PdfFile;
import com.lzb.vistor.v2.WordFile;

/**
 * 压缩接口<br/>
 * Created on : 2021-10-14 10:08
 *
 * @author lizebin
 */
public class Compressor {

    public void compress(PdfFile pdfFile) {
        System.out.println("压缩pdf");
    }

    public void compress(PPTFile pptFile) {
        System.out.println("压缩ppt");
    }

    public void compress(WordFile wordFile) {
        System.out.println("压缩word");
    }

}
