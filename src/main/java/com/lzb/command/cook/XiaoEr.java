package com.lzb.command.cook;

import java.util.ArrayList;
import java.util.List;

public class XiaoEr {

    private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

    /**
     * 点单
     * @param cuisine
     */
    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    /**
     * 下单
     */
    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }

}