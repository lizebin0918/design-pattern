package com.lzb.vistor.gt.v2;

import com.lzb.vistor.gt.v2.extractor.Compressor;
import com.lzb.vistor.gt.v2.extractor.Extractor;

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
    public void accept(Extractor extractor) {
        extractor.extract(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.compress(this);
    }
}
