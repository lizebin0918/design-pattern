package com.lzb.refactor.gildedrose;

/**
 * 陈年干酪<br/>
 * Created on : 2022-04-10 22:02
 *
 * @author lizebin
 */
public class AgedBrie extends AbstractItem {

    private static final String AGED_BRIE_NAME = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE_NAME, sellIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateQualityAfterExpiration() {
        updateQuality();
    }

    @Override
    public void updateQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;
    }
}
