package Accessories;

public class Drumsticks extends Accessory {

    public Drumsticks(String name, double wholesale, double retail) {
        super(name, wholesale, retail);
    }

    public Double calculateMarkUp(Double retail, double wholesale) {
        return retail -= wholesale;
    }
}
