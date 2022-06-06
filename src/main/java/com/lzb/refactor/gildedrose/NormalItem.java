package com.lzb.refactor.gildedrose;

/**
 * 普通商品<br/>
 * Created on : 2022-04-13 10:47
 *
 * @author cidervisioncase
 */
public class NormalItem extends AbstractItem {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        decreaseQuality();
    }

    @Override
    protected void updateQualityAfterExpiration() {
        decreaseSellInDays();
    }
}
