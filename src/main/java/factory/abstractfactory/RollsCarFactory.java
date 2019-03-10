package factory.abstractfactory;

public class RollsCarFactory implements IAbsFactory {


    public IMotor createMotor() {
        return new RollsMotor() ;
    }

    public ITyre createTyre() {
        return new RollsTyre();
    }
}
