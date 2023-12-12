package com.lzb.vistor.ruanjiansheji;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 遍历文件，分别打印txt和java后缀的文件名。例子来自：《从专业到卓越》<br/>
 * Created on : 2023-12-11 23:04
 * @author mac
 */
public class Main {

    private static class FileTraversal {

        private final List<File> files = new ArrayList<>();

        public void traverse(File sourceFile) {
            if (sourceFile.isDirectory()) {
                for (File child : sourceFile.listFiles()) {
                    traverse(child);
                }
                return;
            }
            files.add(sourceFile);
        }

        public void accept(FileVisitor visitor) {
            files.forEach(visitor::visit);
        }

    }

    @FunctionalInterface
    private interface FileVisitor {
        void visit(File file);
    }

    public static void main(String[] args) {
        FileTraversal fileTraversal = new FileTraversal();
        fileTraversal.traverse(new File("/Users/lizebin/project/my-ddd"));
        List<FileVisitor> visitors = new ArrayList<>();
        visitors.add(
            file -> {
                if (file.getName().endsWith(".txt")) {
                    System.out.println("txt:" + file.getName());
                }
            }
        );
        visitors.add(
            file -> {
                if (file.getName().endsWith(".java")) {
                    System.out.println("java:" + file.getName());
                }
            }
        );
        visitors.forEach(fileTraversal::accept);
    }

}
