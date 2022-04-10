package com.lzb.refactor_pratice.gildedrose;

import lombok.AllArgsConstructor;

/**
 * 抽象商品<br/>
 * Created on : 2022-04-10 21:59
 *
 * @author lizebin
 */
@AllArgsConstructor
public abstract class AbstractItem {

    public final int sellIn;

    public final int quality;

    @Override
    public String toString() {
        return this.getName() + ", " + this.sellIn + ", " + this.quality;
    }

    /**
     * 更新价值
     */
    public abstract void updateQuality();

    /**
     * 获取姓名
     * @return
     */
    public abstract String getName();

}
