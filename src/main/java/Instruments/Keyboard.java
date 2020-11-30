package Instruments;

import Behaviours.IPlay;

public class Keyboard extends Instrument implements IPlay {
    private int keys;
    private int modes;

    public Keyboard(String make, String colour, InstrumentType instrumentType, double wholesale, double retail, int keys, int modes) {
        super(make, colour, instrumentType, wholesale, retail);
        this.keys = keys;
        this.modes = modes;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public int getModes() {
        return modes;
    }

    public void setModes(int modes) {
        this.modes = modes;
    }

    public String play() {
        return "Insert Through the Fire and the Flames by Dragonforce";
    }
    //This class implements IPlay therefore has to have the IPlay methods.


    public Double calculateMarkUp(Double retail, double wholesale) {
        return retail -= wholesale;
    }
    //This class implements ISell therefore has to have the ISell methods.

}
