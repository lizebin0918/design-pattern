package com.lzb.refactoring.composing.methods;

/**
 * 方法归位<br/>
 * Created on : 2022-07-07 23:23
 *
 * @author lizebin
 */
public class InlineMethod {

    private int numberOfLateDeliveries;

    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }

    ///////////////////////////////////////////////////////////////////////////
    // 重构后
    ///////////////////////////////////////////////////////////////////////////

    int getRating1() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }

}
