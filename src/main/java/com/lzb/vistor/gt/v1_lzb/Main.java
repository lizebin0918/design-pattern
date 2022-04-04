package com.lzb.vistor.gt.v1_lzb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 如果工具的功能（非文件类型增加）不停扩展，需要支持压缩
 * 1.违背开闭原则，添加一个新功能，所有类的代码都要修改
 * 2.随着功能增多，每个类的代码都不断膨胀，可读性和可维护性都变差
 * 3.把所有比较上层的业务逻辑都耦合到 PdfFile、PPTFile、WordFile类中，导致这些类的职责不够单一，变成了大杂烩
 *
 * Created on : 2021-10-13 22:25
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        for (ResourceFile resourceFile : listAllResourceFiles("")) {
            resourceFile.extract2txt();
            // 外部调用要加拼装逻辑
            resourceFile.zip();
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
