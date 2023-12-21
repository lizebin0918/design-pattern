package com.lzb.pricinple.lsp.demo.v1;

import lombok.Setter;

/**
 * 矩形<br/>
 * Created on : 2023-12-21 10:01
 * @author lizebin
 */

@Setter // 子类可以继承
public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }

}
