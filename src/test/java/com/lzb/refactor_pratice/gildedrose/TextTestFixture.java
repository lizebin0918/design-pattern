package com.lzb.refactor_pratice.gildedrose;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * 基准测试
 */
public class TextTestFixture {

    @Test
    public void test() {
        assertEquals(baseLine(), myLine());
    }

    private String baseLine() {
        return "OMGHAI!\n" +
                "-------- day 0 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 10, 20\n" +
                "Aged Brie, 2, 0\n" +
                "Elixir of the Mongoose, 5, 7\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 15, 20\n" +
                "Backstage passes to a TAFKAL80ETC concert, 10, 49\n" +
                "Backstage passes to a TAFKAL80ETC concert, 5, 49\n" +
                "Backstage passes to a TAFKAL80ETC concert, 1, 20\n" +
                "Conjured Mana Cake, 3, 6\n" +
                "\n" +
                "-------- day 1 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 9, 19\n" +
                "Aged Brie, 1, 1\n" +
                "Elixir of the Mongoose, 4, 6\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
                "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 0, 23\n" +
                "Conjured Mana Cake, 2, 5\n" +
                "\n" +
                "-------- day 2 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 8, 18\n" +
                "Aged Brie, 0, 2\n" +
                "Elixir of the Mongoose, 3, 5\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 13, 22\n" +
                "Backstage passes to a TAFKAL80ETC concert, 8, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 3, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, -1, 0\n" +
                "Conjured Mana Cake, 1, 4\n\n";
    }

    /**
     * 基准测试
     * @return
     */
    private String myLine() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);

        printStream.println("OMGHAI!");

        AbstractItem[] items = new AbstractItem[] {
                new NormalItem("+5 Dexterity Vest", 10, 20), //
                new AgedBrie(2, 0), //
                new NormalItem("Elixir of the Mongoose", 5, 7), //
                new Sulfuras(0, 80), //
                new Sulfuras(-1, 80),
                new Backstage(15, 20),
                new Backstage(10, 49),
                new Backstage( 5, 49),
                new Backstage(1, 20),
                // this conjured item does not work properly yet
                new NormalItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (AbstractItem item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.passOneDay();
        }

        String baseLine = baos.toString();
        return baseLine;
    }

}
