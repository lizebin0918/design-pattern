package com.lzb.command.xiaofuge.cook;

/**
 * 广东菜
 */
public class GuangDoneCuisine implements ICuisine {

    private ICooker cook;

    public GuangDoneCuisine(ICooker cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}