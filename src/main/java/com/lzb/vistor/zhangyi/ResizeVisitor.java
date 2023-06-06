package com.lzb.vistor.zhangyi;

/**
 * 如果新增一个新的类型，需要添加一个新的接口<br/>
 * Created on : 2023-06-06 10:16
 * @author lizebin
 */
public class ResizeVisitor implements IVideoMediaVisitor, IRmVisitor, IMpegVisitor {

    @Override
    public void visit(Rm rm) {
        System.out.println("rm resize");
    }

    @Override
    public void visit(Mpeg mpeg) {
        System.out.println("mpeg resize");
    }
}
