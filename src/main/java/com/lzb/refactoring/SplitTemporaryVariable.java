package com.lzb.refactoring;

/**
 * 拆分临时变量<br/>
 * Created on : 2022-07-08 08:24
 *
 * @author lizebin
 */
public class SplitTemporaryVariable {

    public static void main(String[] args) {
        double height = 1, width = 1;

        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);

        ///////////////////////////////////////////////////////////////////////////
        // 重构后
        ///////////////////////////////////////////////////////////////////////////

        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);

    }

}
