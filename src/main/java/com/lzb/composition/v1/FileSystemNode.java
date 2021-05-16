package com.lzb.composition.v1;

import java.io.File;
import java.util.*;

/**
 * 文件系统<br/>
 * Created on : 2021-05-16 16:06
 * @author lizebin
 */
public class FileSystemNode {

    private String path;

    private boolean isFile;

    private List<FileSystemNode> subNodes = new ArrayList<>();

    /**
     * @param path 文件路径
     * @param isFile 是否为文件
     */
    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if (isFile) return 1;
        int fileCount = 0;
        for (FileSystemNode sub : subNodes) {
            fileCount += sub.countNumOfFiles();
        }
        return fileCount;
    }

    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) return 0;
            return file.length();
        }
        long size = 0;
        for (FileSystemNode file : subNodes) {
            size += file.countSizeOfFiles();
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
            if (subNodes.get(i).path.equalsIgnoreCase(fileOrDir.path)) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }

}
