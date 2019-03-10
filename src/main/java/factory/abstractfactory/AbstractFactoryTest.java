package factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        RollsCarFactory rollsCarFactory = new RollsCarFactory();
        rollsCarFactory.createMotor().createMotor();
        rollsCarFactory.createTyre().createTyre();
    }
}
