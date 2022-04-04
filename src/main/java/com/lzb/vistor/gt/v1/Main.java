package com.lzb.vistor.gt.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据不同的文件类型解析并读取内容，格式包括：PDF，PPT，WORD<br/>
 *
 * Created on : 2021-10-13 22:25
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        for (ResourceFile resourceFile : listAllResourceFiles("")) {
            resourceFile.extract2txt();
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFileList = new ArrayList<>();
        resourceFileList.add(new PdfFile("a.pdf"));
        resourceFileList.add(new WordFile("a.docx"));
        resourceFileList.add(new PPTFile("c.ppt"));
        return resourceFileList;
    }

}
