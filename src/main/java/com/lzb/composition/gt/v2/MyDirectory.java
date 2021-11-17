package com.lzb.composition.gt.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录<br/>
 * Created on : 2021-05-16 17:27
 * @author lizebin
 */
public class MyDirectory extends FileSystemNode {

    private List<FileSystemNode> subNodes = new ArrayList<>();

    public MyDirectory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    @Override
    public long countSizeOfFiles() {
        long size = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            size += fileOrDir.countSizeOfFiles();
        }
        return size;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void remove(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (;i<size;++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
