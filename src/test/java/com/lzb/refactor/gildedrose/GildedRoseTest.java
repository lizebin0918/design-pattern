package com.lzb.refactor.gildedrose;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void foo() {
        AbstractItem[] items = new AbstractItem[] { new NormalItem("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.passOneDay();
        assertEquals("foo", app.items[0].name);
        assertEquals(4, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

}
