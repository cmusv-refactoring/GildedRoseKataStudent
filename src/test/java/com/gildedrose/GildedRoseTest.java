package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    /**
     * General method to create an instance of GildedRose; thus we can reduce duplication on test cases
     */
    private GildedRose getGildedRose(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };

        return new GildedRose(items);
    }

    /**
     * Once the sell by date has passed, Quality degrades twice as fast
     */
    @Test
    public void whenSellInDateHasPassedQualityDegradesTwiceAsFast() {
        GildedRose app = getGildedRose("cake", 0, 2);

        app.updateQuality();

        Assertions.assertEquals(0, app.items[0].quality);
    }

    /**
     * The Quality of an item is never negative
     */
    @Test
    public void theQualityOfAnItemIsNeverNegative() {
        GildedRose app = getGildedRose("cake", 1, 0);

        app.updateQuality();

        Assertions.assertEquals(0, app.items[0].quality);
    }

    /**
     * The Quality of an item is never negative even after selling date
     */
    @Test
    public void theQualityOfAnItemIsNeverNegativeEvenAfterSellByDate() {
        GildedRose app = getGildedRose("cake", 0, 0);

        app.updateQuality();

        Assertions.assertEquals(0, app.items[0].quality);
    }

    /**
     * "Aged Brie" actually increases in Quality the older it gets
     */
    @Test
    public void agedBrieIncreasesInQualityWithAge() {
        GildedRose app = getGildedRose("Aged Brie", 1, 0);

        app.updateQuality();

        Assertions.assertEquals(1, app.items[0].quality);
    }


}
