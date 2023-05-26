package com.lzb.composition.html;

import lombok.Data;

/**
 * <br/>
 * Created on : 2023-05-26 17:42
 * @author lizebin
 */
@Data
public abstract class Control {

    protected String data;

    protected Controls children;

    public void renderControl(String data) {
        children.forEach(item -> item.render(data));
    }

    void render(String data) {
        this.data = data;
    }

    abstract void createControls();
}
