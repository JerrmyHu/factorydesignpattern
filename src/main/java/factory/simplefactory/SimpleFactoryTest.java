package factory.simplefactory;

import factory.FerrariCar;
import factory.RollsCar;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        FerrariCar ferrari = (FerrariCar) carFactory.createMotor("ferrari");
        ferrari.createMotor();

        RollsCar rolls = (RollsCar) carFactory.createMotor("rolls");
        rolls.createMotor();
    }
}
