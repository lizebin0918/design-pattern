package com.lzb.vistor.ruanjiansheji;

import java.io.File;
import java.util.List;

import lombok.AllArgsConstructor;

/**
 * 遍历文件，分别打印txt和java后缀的文件名。例子来自：《从专业到卓越》<br/>
 * Created on : 2023-12-11 23:04
 * @author mac
 */
public class Main {

    @AllArgsConstructor(staticName = "of")
    private static class FileTraversal {

        private final List<FileVisitor> visitors;
        private final File file;

        public void traverse() {
            if (file.isDirectory()) {
                for (File child : file.listFiles()) {
                    FileTraversal.of(visitors, child).traverse();
                }
                return;
            }
            for (FileVisitor visitor : visitors) {
                visitor.visit(file);
            }
        }

    }

    @FunctionalInterface
    private interface FileVisitor {
        void visit(File file);
    }

    public static void main(String[] args) {
        FileTraversal.of(List.of(
                (file) -> {
                    if (file.getName().endsWith(".txt")) {
                        System.out.println("txt:" + file.getName());
                    }
                }
                ,
                (file) -> {
                    if (file.getName().endsWith(".java")) {
                        System.out.println("java:" + file.getName());
                    }
                }
        ), new File("/Users/lizebin/project/my-ddd")).traverse();
    }

}
