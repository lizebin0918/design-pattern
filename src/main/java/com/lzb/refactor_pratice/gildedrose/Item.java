package com.lzb.refactor_pratice.gildedrose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }

    public boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    public boolean isBackstagePasses() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    /**
     * 过了一天
     */
    public void passOneDay() {
        boolean isBackstagePasses = isBackstagePasses();
        boolean isSulfuras = isSulfuras();
        boolean idAgedBrie = isAgedBrie();
        if (!idAgedBrie
                && !isBackstagePasses) {
            if (quality > 0) {
                if (!isSulfuras) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstagePasses) {
                    if (sell_in < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sell_in < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }

        if (!isSulfuras) {
            sell_in = sell_in - 1;
        }

        if (sell_in < 0) {
            if (!idAgedBrie) {
                if (!isBackstagePasses) {
                    if (quality > 0) {
                        if (!isSulfuras) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = quality - quality;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}
