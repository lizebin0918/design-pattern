package com.lzb.vistor.zhangyi;

/**
 * 真的只是加一个visitor类就行了<br/>
 * Created on : 2023-06-06 11:05
 * @author lizebin
 */
public class AviResizeVisitor extends ResizeVisitor implements IAviVisitor {

    @Override
    public void visit(Avi avi) {
        System.out.println("avi resize");
    }
}
