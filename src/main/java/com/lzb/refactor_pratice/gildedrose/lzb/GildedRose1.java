package com.lzb.refactor_pratice.gildedrose.lzb;

/**
 * 1.新建子类，逻辑下推？
 * 2.for循环的continue，如果去掉？
 * 因为都是对item操作，相当于是item对象的行为，这样就可以在item内部直接return了
 *
 */
public class GildedRose1 {
    Item1[] items;

    public GildedRose1(Item1[] items) {
        this.items = items;
    }

    public void passOneDay() {
        for (Item1 item : items) {
            item.passOneDay();
        }
    }

}