package com.lzb.refactor.gildedrose;

/**
 * 首先，简单介绍一下我们的系统：
 *
 * 所有商品都有一个"SellIn"值，这是商品的保质期，最好在这么多天之内卖掉
 * 所有商品都有一个"Quality"值，代表商品的价值
 * 每过一天，所有商品的"SellIn"值和"Quality"值都减1
 * 很简单对吧？别着急，有意思的来了……
 *
 * 一旦过了保质期，"Quality"就以双倍的速度下滑。
 * 陈年干酪（Aged Brie）是一种特殊的商品，放得越久，价值反而越高。
 * 商品的价值永远不会小于0，也永远不会超过50。
 * 萨弗拉斯（Sulfuras）是一种传奇商品，没有保质期的概念，质量也不会下滑。
 * 后台通行证（Backstage pass）和陈年干酪有相似之处：越是接近演出日，随着"SellIn"值的增加，商品价值"Quality"值反而上升。在演出前10天，价值每天上升2点；演出前5天，价值每天上升3点。但一旦过了演出日，价值就马上变成0。
 * 我们最近还签了一个供应商，给我们供应魔法召唤物品。这又需要升级我们的系统：
 *
 * 魔法召唤（Conjured）物品的贬值速度是普通物品的两倍。
 * 现在，请开始你的表演~
 *
 */
public class GildedRose {
    AbstractItem[] items;

    public GildedRose(AbstractItem[] items) {
        this.items = items;
    }

    public void passOneDay() {
        for (AbstractItem item : items) {
            item.passOneDay();
        }
    }

    /**以下函数的代码，违反迪米特法则，直接移到Item上*********/

    /*private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePasses(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }*/
}
