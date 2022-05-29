package com.lzb.refactor_pratice.gildedrose.lzb;

/**
 * <br/>
 * Created on : 2022-05-29 10:30
 *
 * @author lizebin
 */
public class AgedBrie extends Item1 {

    public static final String AGED_BRIE = "Aged Brie";

    private AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    boolean isAgedBrie() {
        return true;
    }

    public static AgedBrie createAgedBrie(int sellIn, int quality) {
        return new AgedBrie(AGED_BRIE, sellIn, quality);
    }
}
