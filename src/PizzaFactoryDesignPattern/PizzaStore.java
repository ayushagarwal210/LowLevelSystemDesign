package PizzaFactoryDesignPattern;

public abstract class PizzaStore {
    Pizza pizza;
    public void orderPizza(String type){
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    public abstract Pizza createPizza(String type);
}
