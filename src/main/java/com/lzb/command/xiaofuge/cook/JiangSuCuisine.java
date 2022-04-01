package com.lzb.command.xiaofuge.cook;

/**
 * 江苏菜
 */
public class JiangSuCuisine implements ICuisine {

    private ICooker cook;

    public JiangSuCuisine(ICooker cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}