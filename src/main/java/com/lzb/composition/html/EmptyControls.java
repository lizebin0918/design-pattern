package com.lzb.composition.html;

/**
 * <br/>
 * Created on : 2023-05-26 17:51
 * @author lizebin
 */
public class EmptyControls extends Controls {

    public EmptyControls(Control owner) {
        super(owner);
    }

    @Override
    void add(Control control) {
        throw new RuntimeException("不能add");
    }

    @Override
    void remove(Control control) {
        throw new RuntimeException("不能remove");
    }
}
