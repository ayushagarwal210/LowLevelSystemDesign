package DuckSimulatorStrategyDesignPattern;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
