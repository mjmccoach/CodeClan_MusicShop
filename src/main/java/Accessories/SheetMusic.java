package Accessories;

public class SheetMusic extends Accessory {
    public SheetMusic(String name, double wholesale, double retail) {
        super(name, wholesale, retail);
    }

    public Double calculateMarkUp(Double retail, double wholesale) {
        return retail -= wholesale;
    }
    //Superclass implements ISell and therefore needs to have the methods of ISell
}
