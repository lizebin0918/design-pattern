package com.lzb.refactor_pratice.gildedrose;

/**
 * 陈年干酪<br/>
 * Created on : 2022-04-10 22:02
 *
 * @author lizebin
 */
public class AgedBrie extends AbstractItem {

    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public String getName() {
        return "Aged Brie";
    }


}
