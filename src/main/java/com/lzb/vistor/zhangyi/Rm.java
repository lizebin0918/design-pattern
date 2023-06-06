package com.lzb.vistor.zhangyi;

/**
 * <br/>
 * Created on : 2023-06-06 10:13
 * @author lizebin
 */
public class Rm implements IVideoMedia {

    @Override
    public void showScript() {
        System.out.println("rm show script");
    }

    @Override
    public void accept(IVideoMediaVisitor visitor) {
        if (visitor instanceof IRmVisitor) {
            ((IRmVisitor)visitor).visit(this);
        }
    }
}
