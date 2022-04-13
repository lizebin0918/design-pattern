package com.lzb.refactor_pratice.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public boolean isAgedBrie() {
        return false;
    }

    public boolean isSulfuras() {
        return false;
    }

    public boolean isBackstagePasses() {
        return false;
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

    protected void updateQuality() {
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

    protected void updateQualityAfterExpiration() {
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

    protected boolean isExpired() {
        return sellIn < 0;
    }

    protected void updateSellInDays() {
        sellIn = sellIn - 1;
    }
}
