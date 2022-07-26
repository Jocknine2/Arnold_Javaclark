package car;

import behaviours.Icar;
import engine.EngineType;

public abstract class Car implements Icar {
    EngineType engine;
    private int doors;

    private String colour;

    private int price;


    public Car(EngineType engine, int doors, int price, String colour){
        this.engine = engine;
        this.doors = doors;
        this.colour = colour;
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
