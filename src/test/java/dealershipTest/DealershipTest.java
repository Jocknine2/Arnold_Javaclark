package dealershipTest;

import car.Electric_Car;
import car.Petrol_Car;
import dealership.Dealership;
import engine.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Petrol_Car pCar;
    Electric_Car eCar;


    @Before
    public void before() {
        dealership = new Dealership(600);
        pCar = new Petrol_Car(EngineType.IC_Engine,5, 150, "Blue");
        eCar = new Electric_Car(EngineType.E_Engine,2, 90, "Red");
    }

    @Test
    public void hasTill(){
        assertEquals(600, dealership.getTill());
    }

    @Test
    public void dealershipHasCars(){
        dealership.addStock(pCar);
        dealership.addStock(eCar);
        assertEquals(2,dealership.getStock());
    }

}
