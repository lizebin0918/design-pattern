package com.lzb.vistor.v2;

import com.lzb.vistor.v2.extractor.Compressor;
import com.lzb.vistor.v2.extractor.Extractor;

/**
 * <br/>
 * Created on : 2021-10-14 08:38
 *
 * @author lizebin
 */
public class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.compress(this);
    }
}