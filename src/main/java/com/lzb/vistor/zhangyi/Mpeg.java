package com.lzb.vistor.zhangyi;

/**
 * <br/>
 * Created on : 2023-06-06 10:14
 * @author lizebin
 */
public class Mpeg implements IVideoMedia {

    @Override
    public void showScript() {
        System.out.println("mpeg show script");
    }

    @Override
    public void accept(IVideoMediaVisitor visitor) {
        if (visitor instanceof IMpegVisitor) {
            ((IMpegVisitor)visitor).visit(this);
        }
    }
}
