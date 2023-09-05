package AbstractFactoryDesignPattern.Vehicle;

public class Mercedes implements Vehicle{
    @Override
    public void average() {
        System.out.println("average= 20");
    }
    @Override
    public void name() {
        System.out.println("Mercedes");
    }
}
