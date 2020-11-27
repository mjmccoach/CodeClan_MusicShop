package Instruments;

public class Keyboard extends Instrument {
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
}
