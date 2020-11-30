import Accessories.Drumsticks;
import Behaviours.ISell;
import Instruments.Drums;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private ISell guitar;
    private ISell drumsticks;

    @Before
    public void before() {
        shop = new Shop("CodeClan Music Store");
        guitar = new Guitar("Fender", "Blue", InstrumentType.GUITAR, 200.00, 300.00, 5, GuitarType.ACOUSTIC);
        drumsticks = new Drumsticks("Big Bangers", 15.00, 30.00);

        shop.addStock(guitar);

    }

    @Test
    public void canAddStock () {
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(guitar);
        assertEquals(0, shop.getStock());
    }

//    @Test
//    public void canCalculateTotalProfit() {
//        assertEquals(15.00, shop.calculateProfit(ArrayList stock));
//    }
}
