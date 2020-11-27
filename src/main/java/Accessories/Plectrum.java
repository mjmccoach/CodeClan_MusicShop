package Accessories;

public class Plectrum extends Accessory {
    public Plectrum(String name, double wholesale, double retail) {
        super(name, wholesale, retail);
    }

    public Double calculateMarkUp(Double retail, double wholesale) {
        return retail -= wholesale;
    }
}
