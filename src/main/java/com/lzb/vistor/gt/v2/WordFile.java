package com.lzb.vistor.gt.v2;

import com.lzb.vistor.gt.v2.extractor.Compressor;
import com.lzb.vistor.gt.v2.extractor.Extractor;

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
    public void accept(Extractor extractor) {
        extractor.extract(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.compress(this);
    }

}
