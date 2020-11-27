package Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class AccessoriesTest {

    private Plectrum plectrum;

    @Before
    public void before() {
        plectrum = new Plectrum("Lightning Pick", 1.00, 1.50);
    }

    @Test
    public void hasName() {
        assertEquals("Lightning Pick", plectrum.getName());
    }

    @Test
    public void hasWholesale() {
        assertEquals(1.00, plectrum.getWholesale(), 0.01);
    }

    @Test
    public void hasRetail() {
        assertEquals(1.50, plectrum.getRetail(), 0.01);
    }

    @Test
    public void canSetName() {
        plectrum.setName("Mjolnir");
        assertEquals("Mjolnir", plectrum.getName());
    }

    @Test
    public void canSetWholeSale() {
        plectrum.setWholesale(0.75);
        assertEquals(0.75, plectrum.getWholesale(),0.01);
    }

    @Test
    public void canSetRetail() {
        plectrum.setRetail(1.50);
        assertEquals(1.50, plectrum.getRetail(),0.01);
    }
}
