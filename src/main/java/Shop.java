import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addStock(ISell stockToAdd) {
        this.stock.add(stockToAdd);
    }

    public void removeStock(ISell stockToRemove) {
        this.stock.remove(stockToRemove);
    }

    public int getStock() {
        return this.stock.size();
    }

    public String getName() {
        return name;
    }
}
