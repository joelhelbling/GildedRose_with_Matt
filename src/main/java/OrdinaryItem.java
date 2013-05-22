public class OrdinaryItem extends Item {
    public OrdinaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;
        if(sellIn >= 0) {
            quality--;
        } else {
            quality -= 2;
        }
        if(quality < 0) {
            quality = 0;
        }
    }

}
