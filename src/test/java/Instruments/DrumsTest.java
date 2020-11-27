package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    private Drums drums;

    @Before
    public void before() {
        drums = new Drums("Zeljan", "Orange", InstrumentType.DRUMS, 200.00, 300.00, 5);
    }

    @Test
    public void canGetDrums() {
        assertEquals(5, drums.getDrumNumber());
    }

    @Test
    public void canSetDrums() {
        drums.setDrumNumber(6);
        assertEquals(6, drums.getDrumNumber());
    }
}
