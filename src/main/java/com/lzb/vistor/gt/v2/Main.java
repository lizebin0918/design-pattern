package com.lzb.vistor.gt.v2;

import com.lzb.vistor.gt.v2.extractor.Extractor;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据不同的文件类型解析并读取内容，格式包括：PDF，PPT，WORD<br/>
 *
 * 如果工具的功能不停扩展，不仅要抽取文本内容，还要支持压缩、提取文件元信息构建等一系列的功能
 * 1.违背开闭原则，添加一个新功能，所有类的代码都要修改
 * 2.随着功能增多，每个类的代码都不断膨胀，可读性和可维护性都变差
 * 3.把所有比较上层的业务逻辑都耦合到 PdfFile、PPTFile、WordFile类中，导致这些类的职责不够单一，变成了大杂烩
 *
 * 多态是一种动态绑定，可以在运行时获取对象的实际类型，来运行实际类型对应的方法。而函数重载是一种静态绑定，在编译时并不能获取对象的实际类型，
 * 而是根据声明类型执行声明类型的对应方法
 *
 * c.a(父类);// 无法编译通过
 *
 * class C {
 *     void a(子类1) {}
 *     void a(子类2) {}
 *     void a(子类3) {}
 * }
 *
 * Created on : 2021-10-13 22:25
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        for (ResourceFile resourceFile : listAllResourceFiles("")) {
            resourceFile.accept(extractor);
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
