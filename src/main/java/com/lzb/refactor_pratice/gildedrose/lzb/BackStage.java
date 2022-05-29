package com.lzb.refactor_pratice.gildedrose.lzb;

/**
 * <br/>
 * Created on : 2022-05-29 10:31
 *
 * @author lizebin
 */
public class BackStage extends Item1 {

    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    private BackStage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static BackStage createBackStage(int sellIn, int quality) {
        return new BackStage(BACKSTAGE, sellIn, quality);
    }

    @Override
    boolean isBackStage() {
        return true;
    }
}
