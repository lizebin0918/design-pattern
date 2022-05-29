package com.lzb.refactor_pratice.gildedrose.lzb;

public class Item1 {

    public String name;

    public int sellIn;

    public int quality;

    public Item1(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    boolean isSulfuras() {
        return name.equals(Sulfuras.NAME);
    }

    boolean isAgedBrie() {
        return name.equals(AgedBrie.NAME);
    }

    boolean isBackStage() {
        return name.equals(BackStage.NAME);
    }
}