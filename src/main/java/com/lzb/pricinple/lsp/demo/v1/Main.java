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

        // 父类引用指向子类对象
        // 该如何解释“正方形居然不是矩形”这个问题呢？这要回到“对象的职责”这个本质上。
        // 尽管从数学角度上讲正方形是一种矩形，但是由于Rectangle类定义了setWidth和setHeight的职责，
        // 而Square类无法实现这一职责，所以从职责上讲，不能认为“正方形是矩形”。
        // 继承不是关于客观事物的分类法，而是关于职责的，也就是面向职责的抽象
        // ！！！！！说白了就是 Square 不应该有 setWidth 和 setHeight 方法，这个职责不属于它的！！！！
        Rectangle rectangle = square;

        // 20 破坏父类行为，违反里氏替原则
        rectangle.setWidth(5);
        System.out.println(square.getArea());
    }

}
