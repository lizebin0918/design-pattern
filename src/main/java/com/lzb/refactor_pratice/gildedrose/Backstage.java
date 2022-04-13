package com.lzb.refactor_pratice.gildedrose;

/**
 * <br/>
 * Created on : 2022-04-12 10:02
 *
 * @author lizebin
 */
public class Backstage extends Item {

    private static final String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE_NAME, sellIn, quality);
    }

    @Override
    public boolean isBackstagePasses() {
        return true;
    }

    @Override
    public void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    public void updateQuality() {
        increaseQuality();

        if (sellIn < 11) {
            increaseQuality();
        }

        if (sellIn < 6) {
            increaseQuality();
        }
    }

    private void increaseQuality() {
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;
    }

}
