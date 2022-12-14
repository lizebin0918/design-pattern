package com.lzb.refactoring.composing.methods;

/**
 * 禁止对参数赋值<br/>
 * Created on : 2022-07-08 08:28
 *
 * @author lizebin
 */
public class RemoveAssignmentsToParameters {

    int discount(int inputVal, int quantity) {
        if (quantity > 50) {
            inputVal -= 2;
        }
        return 0;
    }

    ///////////////////////////////////////////////////////////////////////////
    // 重构后：防止对外部变量产生副作用
    ///////////////////////////////////////////////////////////////////////////

    int discount1(int inputVal, int quantity) {
        int result = inputVal;
        if (quantity > 50) {
            result -= 2;
        }
        return 0;
    }

}
