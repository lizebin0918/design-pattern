package com.lzb.composition.html;

/**
 * <br/>
 * Created on : 2023-05-26 17:54
 * @author lizebin
 */
public abstract class HtmlControl extends Control {
    @Override
    void createControls() {
        this.children = new EmptyControls(this);
    }

}
