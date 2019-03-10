package factory.factorymethod;

import factory.FerrariCar;
import factory.ICar;

public class FerrariCarFactory implements ICarFactory {

    public ICar createMotor() {
        return new FerrariCar();
    }
}
