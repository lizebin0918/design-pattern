package com.lzb.vistor.gt.v2;

import com.lzb.vistor.gt.v2.extractor.Compressor;
import com.lzb.vistor.gt.v2.extractor.Extractor;

/**
 * <br/>
 * Created on : 2021-10-13 22:24
 *
 * @author lizebin
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 提取文件
     * @param extractor 提取器
     */
    public abstract void accept(Extractor extractor);

    /**
     * 压缩文件
     * @param compressor 压缩器
     */
    public abstract void accept(Compressor compressor);

}
