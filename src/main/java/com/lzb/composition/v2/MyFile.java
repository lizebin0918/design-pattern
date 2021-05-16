package com.lzb.composition.v2;

import java.io.File;

/**
 * 文件<br/>
 * Created on : 2021-05-16 17:25
 * @author lizebin
 */
public class MyFile extends FileSystemNode {

    public MyFile(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        File file = new File(path);
        if (!file.exists()) return 0;
        return file.length();
    }
}
