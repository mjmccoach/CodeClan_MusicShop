package Instruments;

import Behaviours.IPlay;

public class Drums extends Instrument implements IPlay{
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

    public String play() {
        return "Bang Bang!";
    }
    //This class implements IPlay therefore has to have the IPlay methods.


    public Double calculateMarkUp(Double retail, double wholesale) {
        return retail -= wholesale;
    }
    //This class implements IPlay therefore has to have the IPlay methods.

}
