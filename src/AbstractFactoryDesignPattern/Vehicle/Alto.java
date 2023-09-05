package AbstractFactoryDesignPattern.Vehicle;

public class Alto implements Vehicle{
    @Override
    public void average() {
        System.out.println("average= 27");
    }
    @Override
    public void name() {
        System.out.println("Alto");
    }
}
