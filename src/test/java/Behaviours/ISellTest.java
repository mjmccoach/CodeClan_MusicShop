package Behaviours;

import Accessories.Drumsticks;
import Instruments.Drums;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ISellTest {
    private Guitar guitar;
    private Drumsticks drumsticks;

    @Before
    public void before() {
        guitar = new Guitar("Gibson", "Hot Pink", InstrumentType.GUITAR, 200.00, 300.00, 5, GuitarType.ACOUSTIC);
        drumsticks = new Drumsticks("Big Bangers", 15.00, 30.00);
    }

    @Test
    public void canMarkUpInstruments() {
        assertEquals(100.00, guitar.calculateMarkUp(guitar.getRetail(), guitar.getWholesale()), 0.01);
    }

    @Test
    public void canMarkUpAccessories() {
        assertEquals(15.00, drumsticks.calculateMarkUp(drumsticks.getRetail(),drumsticks.getWholesale()),0.01);
    }
}
