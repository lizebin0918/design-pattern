package com.lzb.composition.v2;
/**
 * <br/>
 * Created on : 2021-05-16 17:47
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        MyDirectory fileDir = new MyDirectory("/Users/lizebin/Desktop/temp");
        MyDirectory nodeX = new MyDirectory("/Users/lizebin/Desktop/temp/x");
        MyDirectory nodeY = new MyDirectory("/Users/lizebin/Desktop/temp/y");
        fileDir.addSubNode(nodeX);
        fileDir.addSubNode(nodeY);


        nodeX.addSubNode(new MyFile("/Users/lizebin/Desktop/temp/x/x.txt"));
        nodeX.addSubNode(new MyFile("/Users/lizebin/Desktop/temp/x/x1.txt"));
        nodeY.addSubNode(new MyFile("/Users/lizebin/Desktop/temp/y/y.txt"));
        nodeY.addSubNode(new MyFile("/Users/lizebin/Desktop/temp/y/y1.txt"));

        System.out.println(fileDir.countNumOfFiles());
        System.out.println(fileDir.countSizeOfFiles());
    }

}
