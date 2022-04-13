package com.lzb.refactor_pratice.gildedrose;

/**
 * <br/>
 * Created on : 2022-04-12 10:02
 *
 * @author lizebin
 */
public class Sulfuras extends Item {

    private static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS_NAME, sellIn, quality);
    }

    @Override
    public boolean isSulfuras() {
        return true;
    }

    @Override
    public void updateSellInDays() {}

    @Override
    public void updateQualityAfterExpiration() {}

    @Override
    public void updateQuality() {
    }
}
