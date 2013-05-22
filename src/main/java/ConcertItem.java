public class ConcertItem extends Item {
    public ConcertItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;
        if(sellIn >= 10) {
            quality++;
        } else if(sellIn >= 5) {
            quality += 2;
        } else if(sellIn >= 0) {
            quality += 3;
        } else {
            quality = 0;
        }
        if(quality > 50) {
            quality = 50;
        }

    }
}
