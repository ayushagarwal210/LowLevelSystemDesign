package DuckSimulatorStrategyDesignPattern;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("No Quack!");
    }
}
