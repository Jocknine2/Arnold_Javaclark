package dealership;

import behaviours.Icar;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Icar> stock;

    public Dealership(int till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addStock(Icar car) {
        this.stock.add(car);
    }
}
