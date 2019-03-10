package factory.factorymethod;

import factory.ICar;
import factory.RollsCar;

public class RollsCarFactory implements ICarFactory {
    public ICar createMotor() {
        return new RollsCar();
    }
}
