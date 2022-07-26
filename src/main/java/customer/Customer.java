package customer;

import behaviours.Icar;
import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class Customer {

    private int wallet;

    private ArrayList<Icar>cars;

    public Customer(int wallet) {
        this.wallet = wallet;
        this.cars = new ArrayList<>();
    }


    public int getWallet() {
        return wallet;
    }

    public int setWallet(int wallet) {
        return this.wallet = wallet;
    }

    public int getCars() {
        return cars.size();
    }

    public void addCar(Icar car) {
        this.cars.add(car);
    }

    public Icar selectCar(String model){
        for(Icar; this.cars){
            if (Icar.getModel() == model)
                return car;
        }
    }
}
