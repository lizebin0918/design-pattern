package com.lzb.refactor_pratice.gildedrose.lzb;

/**
 * <br/>
 * Created on : 2022-05-29 10:30
 *
 * @author lizebin
 */
public class AgedBrie extends Item1 {

    public static final String NAME = "Aged Brie";

    private AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    boolean isAgedBrie() {
        return true;
    }

    public static AgedBrie createAgedBrie(int sellIn, int quality) {
        return new AgedBrie(NAME, sellIn, quality);
    }

    @Override
    protected void updateQualityInExpired() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;
    }
}
