package com.lzb.refactor.gildedrose.lzb;

/**
 * <br/>
 * Created on : 2022-05-29 10:35
 *
 * @author lizebin
 */
public class NormalItem extends Item1 {

    private NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static NormalItem createNormalItem(String name, int sellIn, int quality) {
        return new NormalItem(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }
}
