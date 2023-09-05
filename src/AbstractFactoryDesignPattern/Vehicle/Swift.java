package AbstractFactoryDesignPattern.Vehicle;

public class Swift implements Vehicle{
    @Override
    public void average() {
        System.out.println("average= 30");
    }

    @Override
    public void name() {
        System.out.println("Swift");
    }
}
