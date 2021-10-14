package com.lzb.vistor.v2.extractor;

import com.lzb.vistor.v2.PPTFile;
import com.lzb.vistor.v2.PdfFile;
import com.lzb.vistor.v2.WordFile;

/**
 * 提取接口<br/>
 * Created on : 2021-10-14 10:08
 *
 * @author lizebin
 */
public class Extractor {

    public void extract(PdfFile pdfFile) {
        System.out.println("提取pdf");
    }

    public void extract(PPTFile pptFile) {
        System.out.println("提取ppt");
    }

    public void extract(WordFile wordFile) {
        System.out.println("提取word");
    }

}
