package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Gibson","Red",InstrumentType.GUITAR, 100.00, 200.00,5,GuitarType.ACOUSTIC);
    }

    @Test
    public void canGetMake() {
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }

    @Test
    public void canGetWholeSale() {
        assertEquals(100.00, guitar.getWholesale(), 0.01);
    }

    @Test
    public void canGetRetail() {
        assertEquals(200.00, guitar.getRetail(), 0.01);
    }

    @Test
    public void canGetStrings() {
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, guitar.getGuitarType());
    }
    
}
