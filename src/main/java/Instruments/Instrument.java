package Instruments;

import Behaviours.ISell;

public abstract class Instrument implements ISell{
    private String make;
    private String colour;
    InstrumentType instrumentType;
    private double wholesale;
    private double retail;

    public Instrument(String make, String colour, InstrumentType instrumentType, double wholesale, double retail) {
        this.make = make;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.wholesale = wholesale;
        this.retail = retail;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public double getWholesale() {
        return wholesale;
    }

    public void setWholesale(double wholesale) {
        this.wholesale = wholesale;
    }

    public double getRetail() {
        return retail;
    }

    public void setRetail(double retail) {
        this.retail = retail;
    }

    public double calculateMarkUp(double retail, double wholesale) {
        return retail -= wholesale;
    }
    //This class implements IPlay therefore has to have the IPlay methods.

}
