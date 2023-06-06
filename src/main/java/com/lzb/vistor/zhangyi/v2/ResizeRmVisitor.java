package com.lzb.vistor.zhangyi.v2;

import com.lzb.vistor.zhangyi.IVideoMedia;

/**
 * <br/>
 * Created on : 2023-06-06 10:22
 * @author lizebin
 */
public class ResizeRmVisitor implements IVideoMediaVisitorV2 {

    @Override
    public void visit(IVideoMedia media) {
        System.out.println("v2 rm visitor");
    }
}
