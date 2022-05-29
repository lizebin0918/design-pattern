package com.lzb.refactor_pratice.gildedrose.lzb;

public class GildedRose1 {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item1[] items;

    public GildedRose1(Item1[] items) {
        this.items = items;
    }

    public void passOneDay() {
        for (Item1 item : items) {
            if (!item.isAgedBrie()
                && !item.isBackStage()) {
                if (item.quality > 0) {
                    if (!item.isSulfuras()) {
                        item.quality = item.quality - 1;
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.isBackStage()) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!item.isSulfuras()) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn >= 0) {
                continue;
            }

            if (item.isAgedBrie()) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
                continue;
            }

            if (item.isBackStage()) {
                item.quality = 0;
                continue;
            }

            if (item.isSulfuras()) {
                continue;
            }

            if (item.quality <= 0) {
                continue;
            }
            item.quality = item.quality - 1;
        }
    }

}