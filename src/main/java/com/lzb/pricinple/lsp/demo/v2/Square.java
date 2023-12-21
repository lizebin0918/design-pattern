package com.lzb.pricinple.lsp.demo.v2;

import com.lzb.pricinple.lsp.demo.Area;
import com.lzb.pricinple.lsp.demo.v1.Rectangle;

/**
 * <br/>
 * Created on : 2023-12-21 16:11
 * @author lizebin
 */
public class Square implements Area {

    private final Rectangle rectangle;

    public Square(int side) {
        this.rectangle = new Rectangle(side, side);
    }

    public int getArea() {
        return rectangle.getArea();
    }

    public void setSide(int side) {
        rectangle.setWidth(side);
        rectangle.setHeight(side);
    }
}
