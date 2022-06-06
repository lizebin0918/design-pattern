package com.lzb.refactor.gildedrose;

public abstract class AbstractItem {

    public String name;

    public int sellIn;

    public int quality;

    public AbstractItem(String name, int sellIn, int quality) {
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

    protected boolean isBackstagePasses() { return false; }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    /**
     * 过了一天
     */
    public void passOneDay() {
        updateQuality();
        decreaseSellInDays();
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    protected abstract void updateQuality();

    protected abstract void updateQualityAfterExpiration();

    protected void decreaseQuality() {
        if (quality >= 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected void decreaseSellInDays() {
        sellIn = sellIn - 1;
    }
}
