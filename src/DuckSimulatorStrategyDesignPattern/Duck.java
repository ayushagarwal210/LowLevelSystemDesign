package DuckSimulatorStrategyDesignPattern;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck(){
    }
    public abstract void display();
    public void swim(){
        System.out.println("Swim");
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour=flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }

}
