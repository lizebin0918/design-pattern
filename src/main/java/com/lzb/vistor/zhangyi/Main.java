package com.lzb.vistor.zhangyi;

/**
 * <br/>
 * Created on : 2023-06-06 10:18
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        IVideoMedia rm = new Rm();
        rm.accept(new ResizeVisitor());

        IVideoMedia avi = new Avi();
        avi.accept(new AviResizeVisitor());
    }

}
