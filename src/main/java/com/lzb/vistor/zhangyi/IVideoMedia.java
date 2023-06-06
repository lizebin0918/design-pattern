package com.lzb.vistor.zhangyi;

/**
 * <br/>
 * Created on : 2023-06-06 10:12
 * @author lizebin
 */
public interface IVideoMedia {

    void showScript();

    void accept(IVideoMediaVisitor visitor);

}
