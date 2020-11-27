package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay{
    private int strings;
    private GuitarType guitarType;

    public Guitar(String make, String colour, InstrumentType instrumentType, double wholesale, double retail, int strings, GuitarType guitarType) {
        super(make, colour, instrumentType, wholesale, retail);
        this.strings = strings;
        this.guitarType = guitarType;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public String play() {
        return "Widdly Widdly Wah!";
    }

    public Double calculateMarkUp(Double retail, double wholesale) {
        return retail -= wholesale;
    }
}
