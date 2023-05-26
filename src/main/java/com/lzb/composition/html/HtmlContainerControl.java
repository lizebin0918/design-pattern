package com.lzb.composition.html;

/**
 * <br/>
 * Created on : 2023-05-26 18:40
 * @author lizebin
 */
public abstract class HtmlContainerControl extends HtmlControl {

    @Override
    void createControls() {
        this.children = new Controls(this);
    }
}
