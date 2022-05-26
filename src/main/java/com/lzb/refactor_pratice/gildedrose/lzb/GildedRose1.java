package com.lzb.refactor_pratice.gildedrose.lzb;

public class GildedRose1 {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item1[] items;

    public GildedRose1(Item1[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(AGED_BRIE)
                    && !items[i].name.equals(BACKSTAGE)) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals(SULFURAS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals(BACKSTAGE)) {
                        if (items[i].sell_in < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sell_in < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sell_in = items[i].sell_in - 1;
            }

            if (items[i].sell_in >= 0) {
                continue;
            }

            if (items[i].name.equals(AGED_BRIE)) {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
                continue;
            }

            if (items[i].name.equals(BACKSTAGE)) {
                items[i].quality = 0;
                continue;
            }

            if (items[i].name.equals(SULFURAS)) {
                continue;
            }

            if (items[i].quality <= 0) {
                continue;
            }
            items[i].quality = items[i].quality - 1;
        }
    }
}