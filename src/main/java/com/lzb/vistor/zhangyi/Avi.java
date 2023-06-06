package com.lzb.vistor.zhangyi;

/**
 * <br/>
 * Created on : 2023-06-06 11:03
 * @author lizebin
 */
public class Avi implements IVideoMedia {

    @Override
    public void showScript() {
        System.out.println("avi show script");
    }

    @Override
    public void accept(IVideoMediaVisitor visitor) {
        if (visitor instanceof IAviVisitor) {
            ((IAviVisitor)visitor).visit(this);
        }
    }
}
