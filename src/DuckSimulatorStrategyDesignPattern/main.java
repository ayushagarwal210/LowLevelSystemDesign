package DuckSimulatorStrategyDesignPattern;

public class main {
    public static void main(String[] args) {
        Duck duck=new WoodenDuck();
        duck.display();
        duck.setFlyBehaviour(new NoFly());
        duck.setQuackBehaviour(new MuteQuack());
        duck.swim();
        duck.performFly();
        duck.performQuack();
        Duck duck1=new NormalDuck();
        duck1.display();
        duck1.setFlyBehaviour(new FlyWithWings());
        duck1.setQuackBehaviour(new Quack());
        duck1.swim();
        duck1.performFly();
        duck1.performQuack();
    }
}
