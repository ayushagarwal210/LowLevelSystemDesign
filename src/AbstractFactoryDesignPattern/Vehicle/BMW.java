package AbstractFactoryDesignPattern.Vehicle;

public class BMW implements Vehicle{
    @Override
    public void average() {
        System.out.println("average= 23");
    }
    @Override
    public void name() {
        System.out.println("BMW");
    }
}
