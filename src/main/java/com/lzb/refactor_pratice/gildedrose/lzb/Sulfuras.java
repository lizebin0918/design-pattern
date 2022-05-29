package com.lzb.refactor_pratice.gildedrose.lzb;

/**
 * <br/>
 * Created on : 2022-05-29 10:32
 *
 * @author lizebin
 */
public class Sulfuras extends Item1 {

    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    public static Sulfuras createSulfuras(int sellIn, int quality) {
        return new Sulfuras(sellIn, quality);
    }

    @Override
    boolean isSulfuras() {
        return true;
    }
}
