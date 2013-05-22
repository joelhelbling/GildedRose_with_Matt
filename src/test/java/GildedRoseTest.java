import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class GildedRoseTest {

	@Test
	public void normalItemsDegradeByOneBeforeSellBy() {
        Item item = new OrdinaryItem("+5 Dexterity Vest", 10, 20);
        item.updateQuality();
		assertEquals(19, item.getQuality());
	}

    @Test
    public void normalItemsDegradeTwiceAsFastAfterSellBy() {
        Item item = new OrdinaryItem("+5 Dexterity Vest", 0, 10);
        item.updateQuality();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void normalItemsNeverHaveQualityLessThanZero() {
        Item item = new OrdinaryItem("+5 Dexterity Vest", 5, 0);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

    @Test
    public void normalItemsNeverHaveQualityLessThanZeroAfterSellBy() {
        Item item = new OrdinaryItem("+5 Dexterity Vest", -4, 1);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

    @Test
    public void agedBrieIncreasesInQualityByOneBeforeSellBy() {
        Item item = new CheeseItem("Aged Brie", 10, 20);
        item.updateQuality();
        assertEquals(21, item.getQuality());
    }

    @Test
    public void agedBrieIncreasesInQualityByOneAfterSellBy() {
        Item item = new CheeseItem("Aged Brie", 0, 20);
        item.updateQuality();
        assertEquals(22, item.getQuality());
    }

    @Test
    public void agedBrieNeverHasQualityGreaterThanFifty() {
        Item item = new CheeseItem("Aged Brie", 10, 50);
        item.updateQuality();
        assertEquals(50, item.getQuality());
    }

    @Test
    public void agedBrieNeverHasQualityGreaterThanFiftyAfterSellBy() {
        Item item = new CheeseItem("Aged Brie", -10, 49);
        item.updateQuality();
        assertEquals(50, item.getQuality());
    }

    @Test
    public void legendaryItemsNeverDecreaseInQuality() {
        Item item = new LegendaryItem("Sulfuras, Hand of Ragnaros", 10, 80);
        item.updateQuality();
        assertEquals(80, item.getQuality());
    }

    @Test
    public void legendaryItemsNeverDecreaseInQualityAfterSellBy() {
        Item item = new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80);
        item.updateQuality();
        assertEquals(80, item.getQuality());
    }


    @Test
    public void backstagePassesItemsIncreaseBy1TenOrMoreDaysBeforeSellBy() {
        Item item = new ConcertItem("Backstage passes to a TAFKAL80ETC concert", 11, 10);
        item.updateQuality();
        assertEquals(11, item.getQuality());
        item.updateQuality();
        assertEquals(13, item.getQuality());
    }

    @Test
    public void backstagePassesItemsIncreaseBy2FiveOrMoreDaysBeforeSellBy() {
        Item item = new ConcertItem("Backstage passes to a TAFKAL80ETC concert", 6, 10);
        item.updateQuality();
        assertEquals(12, item.getQuality());
        item.updateQuality();
        assertEquals(15, item.getQuality());
    }

    @Test
    public void backstagePassesItemsIncreaseBy3FiveOrLessDaysBeforeSellBy() {
        Item item = new ConcertItem("Backstage passes to a TAFKAL80ETC concert", 1, 10);
        item.updateQuality();
        assertEquals(13, item.getQuality());
    }

    @Test
    public void backstagePassesQualityDropsToZeroAfterConcert() {
        Item item = new ConcertItem("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

    @Test
    public void conjuredItemsDegradeByOneBeforeSellBy() {
        Item item = new ConjuredItem("+5 Dexterity Vest", 10, 20);
        item.updateQuality();
        assertEquals(18, item.getQuality());
    }

    @Test
    public void conjuredItemsDegradeTwiceAsFastAfterSellBy() {
        Item item = new ConjuredItem("+5 Dexterity Vest", 0, 10);
        item.updateQuality();
        assertEquals(6, item.getQuality());
    }

    @Test
    public void conjuredItemsNeverHaveQualityLessThanZero() {
        Item item = new ConjuredItem("+5 Dexterity Vest", 5, 0);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

    @Test
    public void conjuredItemsNeverHaveQualityLessThanZeroAfterSellBy() {
        Item item = new ConjuredItem("+5 Dexterity Vest", -4, 1);
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }

}
