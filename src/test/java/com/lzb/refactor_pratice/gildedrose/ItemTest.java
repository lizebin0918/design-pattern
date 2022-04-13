package com.lzb.refactor_pratice.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void should_double_increase_backstage_pass_value() {
        Item item = new Backstage("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        item.passOneDay();
        assertEquals(item.quality, 21);
        item.passOneDay();
        assertEquals(item.quality, 23);
    }

}