package com.lzb.vistor.gt.v1;

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

    public abstract void extract2txt();

}
