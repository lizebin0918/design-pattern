package com.lzb.refactor_pratice.gildedrose;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void should_double_increase_backstage_pass_value() {
        AbstractItem item = new Backstage(11, 20);
        item.passOneDay();
        assertEquals(item.quality, 21);
        item.passOneDay();
        assertEquals(item.quality, 23);
    }

}