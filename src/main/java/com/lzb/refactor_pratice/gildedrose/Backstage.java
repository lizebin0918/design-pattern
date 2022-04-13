package com.lzb.refactor_pratice.gildedrose;

/**
 * <br/>
 * Created on : 2022-04-12 10:02
 *
 * @author lizebin
 */
public class Backstage extends Item {

    private static final String BACKSTAGE_NAME = "Backstage";

    public Backstage(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
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
        if (quality < 50) {
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

}
