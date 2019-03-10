package factory.simplefactory;

import factory.FerrariCar;
import factory.ICar;
import factory.RollsCar;

public class CarFactory {

    ICar createMotor(String carName){
        if("ferrari".equals(carName)) {
            return new FerrariCar();
        }else if ("rolls".equals(carName)){
            return new RollsCar();
        }else {
            return null;
        }
    }

}
