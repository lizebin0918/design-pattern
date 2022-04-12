package com.lzb.refactor_pratice.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public static Item createBackstagePasses(int sellIn, int quality) {
        return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static Item createAgedBrie(int sellIn, int quality) {
        return new Item("Aged Brie", sellIn, quality);
    }

    public static Item createSulfuras(int sellIn, int quality) {
        return new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    public static Item createNormal(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
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
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    /**
     * 过了一天
     */
    public void passOneDay() {
        updateQuality();
        updateSellInDays();
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    private void updateQuality() {
        if (!isAgedBrie()
                && !isBackstagePasses()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstagePasses()) {
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
    }

    private void updateQualityAfterExpiration() {
        if (!isAgedBrie()) {
            if (!isBackstagePasses()) {
                if (quality > 0) {
                    if (!isSulfuras()) {
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

    private boolean isExpired() {
        return sellIn < 0;
    }

    private void updateSellInDays() {
        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }
    }
}
