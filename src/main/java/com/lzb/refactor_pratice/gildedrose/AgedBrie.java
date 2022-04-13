package com.lzb.refactor_pratice.gildedrose;

/**
 * 陈年干酪<br/>
 * Created on : 2022-04-10 22:02
 *
 * @author lizebin
 */
public class AgedBrie extends Item {

    private static final String AGED_BRIE_NAME = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE_NAME, sellIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;
    }
}
