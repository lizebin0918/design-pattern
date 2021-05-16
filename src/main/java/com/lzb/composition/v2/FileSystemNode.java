package com.lzb.composition.v2;
/**
 * <br/>
 * Created on : 2021-05-16 17:24
 * @author lizebin
 */
public abstract class FileSystemNode {

    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }

}
