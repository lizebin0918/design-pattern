package com.lzb.refactor_pratice.gildedrose.lzb;

public class Item1 {

    public String name;

    public int sellIn;

    public int quality;

    protected Item1(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static AgedBrie createAgedBrie(int sellIn, int quality) {
        return AgedBrie.createAgedBrie(sellIn, quality);
    }

    public static BackStage createBackStage(int sellIn, int quality) {
        return BackStage.createBackStage(sellIn, quality);
    }

    public static Sulfuras createSulfuras(int sellIn, int quality) {
        return Sulfuras.createSulfuras(sellIn, quality);
    }

    public static Item1 createNormal(String name, int sellIn, int quality) {
        return new Item1(name, sellIn, quality);
    }


    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    boolean isSulfuras() {
        return false;
    }

    boolean isAgedBrie() {
        return false;
    }

    boolean isBackStage() {
        return false;
    }

    void passOneDay() {
        if (!isAgedBrie()
            && !isBackStage()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackStage()) {
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

        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }

        if (sellIn >= 0) {
            return;
        }

        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }

        if (isBackStage()) {
            quality = 0;
            return;
        }

        if (isSulfuras()) {
            return;
        }

        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }
}