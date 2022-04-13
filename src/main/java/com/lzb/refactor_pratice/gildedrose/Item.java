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
        if (quality <= 0) {
            return;
        }
        quality = quality - 1;
    }

    protected void updateQualityAfterExpiration() {
        if (quality >= 0) {
            quality = quality - 1;
        }
    }

    protected boolean isExpired() {
        return sellIn < 0;
    }

    protected void updateSellInDays() {
        sellIn = sellIn - 1;
    }
}
