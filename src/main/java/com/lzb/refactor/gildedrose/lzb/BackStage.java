package com.lzb.refactor.gildedrose.lzb;

/**
 * <br/>
 * Created on : 2022-05-29 10:31
 *
 * @author lizebin
 */
public class BackStage extends Item1 {

    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    private BackStage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static BackStage createBackStage(int sellIn, int quality) {
        return new BackStage(NAME, sellIn, quality);
    }

    @Override
    boolean isBackStage() {
        return true;
    }

    @Override
    protected void updateQualityInExpired() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;

        if (sellIn < 11) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }

        if (sellIn < 6) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }
}
