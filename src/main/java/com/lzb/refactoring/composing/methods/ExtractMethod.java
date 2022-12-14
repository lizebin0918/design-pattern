package com.lzb.refactoring.composing.methods;

/**
 * 提取方法<br/>
 * Created on : 2022-07-07 23:20
 *
 * @author lizebin
 */
public class ExtractMethod {

    private String name;

    void printOwing() {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    private String getOutstanding() {
        return null;
    }

    private void printBanner() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // 重构后
    ///////////////////////////////////////////////////////////////////////////

    void printOwing1() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printDetails(String outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

}
