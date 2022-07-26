package customerTest;

import car.Electric_Car;
import car.Petrol_Car;
import customer.Customer;
import engine.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Petrol_Car pCar;
    Electric_Car eCar;

    @Before
    public void before(){
        customer = new Customer (300);
        pCar = new Petrol_Car(EngineType.IC_Engine,5, 150, "Blue");
        eCar = new Electric_Car(EngineType.E_Engine, 2, 90, "Red");

    }

    @Test
    public void customerHasWallet(){
        assertEquals(300, customer.getWallet());
    }

    @Test
    public void newWallet(){
        assertEquals(50000, customer.setWallet(50000));
    }

    @Test
    public void customerHasCars(){
        customer.addCar(pCar);
        customer.addCar(eCar);
        assertEquals(2,customer.getCars());
    }

    @Test
    public void customerCarHasBhp(){
        customer.addCar(pCar);

    }

}

