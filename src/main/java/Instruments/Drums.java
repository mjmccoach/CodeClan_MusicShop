package Instruments;

public class Drums extends Instrument{
    private int drumNumber;

    public Drums(String make, String colour, InstrumentType instrumentType, double wholesale, double retail, int drumNumber) {
        super(make, colour, instrumentType, wholesale, retail);
        this.drumNumber = drumNumber;
    }

    public int getDrumNumber() {
        return drumNumber;
    }

    public void setDrumNumber(int drumNumber) {
        this.drumNumber = drumNumber;
    }
}
