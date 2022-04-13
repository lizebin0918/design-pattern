package com.lzb.refactor_pratice.gildedrose;

/**
 * <br/>
 * Created on : 2022-04-12 10:02
 *
 * @author lizebin
 */
public class Sulfuras extends Item {

    private static final String SULFURAS_NAME = "Sulfuras";

    public Sulfuras(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public boolean isSulfuras() {
        return true;
    }

    @Override
    public void updateSellInDays() {
    }
}
