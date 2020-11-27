package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard("Yamaha", "Black", InstrumentType.KEYBOARD, 500.00, 600.00, 30, 5);
    }

    @Test
    public void hasKeys() {
        assertEquals(30, keyboard.getKeys());
    }

    @Test
    public void hasModes() {
        assertEquals(5, keyboard.getModes());
    }

    @Test
    public void canSetKeys() {
        keyboard.setKeys(32);
        assertEquals(32, keyboard.getKeys());
    }

    @Test
    public void canSetModes() {
        keyboard.setModes(8);
        assertEquals(8, keyboard.getModes());
    }
}
