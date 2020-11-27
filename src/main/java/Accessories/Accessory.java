package Accessories;

import Behaviours.ISell;

public abstract class Accessory implements ISell{

    private String name;
    private double wholesale;
    private double retail;

    public Accessory(String name, double wholesale, double retail) {
        this.name = name;
        this.wholesale = wholesale;
        this.retail = retail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
