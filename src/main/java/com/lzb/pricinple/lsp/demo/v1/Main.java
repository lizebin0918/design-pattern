package com.lzb.pricinple.lsp.demo.v1;

/**
 * <br/>
 * Created on : 2023-12-21 10:10
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Square square = new Square(4);

        // 16
        System.out.println(square.getArea());

        Rectangle rectangle = square;

        // 20 破坏父类行为，违反里氏替原则
        rectangle.setWidth(5);
        System.out.println(square.getArea());
    }

}
