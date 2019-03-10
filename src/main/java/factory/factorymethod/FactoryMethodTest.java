package factory.factorymethod;

import factory.FerrariCar;
import factory.RollsCar;

public class FactoryMethodTest {

    public static void main(String[] args) {
        FerrariCarFactory ferrariCarFactory = new FerrariCarFactory();
        FerrariCar ferrariCar = (FerrariCar) ferrariCarFactory.createMotor();
        ferrariCar.createMotor();


        RollsCarFactory rollsCarFactory = new RollsCarFactory();
        RollsCar rollsCar = (RollsCar) rollsCarFactory.createMotor();
        rollsCar.createMotor();
    }
}
