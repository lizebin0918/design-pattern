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

    protected boolean isAgedBrie() {
        return false;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackstagePasses() {
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
        decreaseQuality();
    }

    protected void updateQualityAfterExpiration() {
        decreaseQuality();
    }

    private void decreaseQuality() {
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
