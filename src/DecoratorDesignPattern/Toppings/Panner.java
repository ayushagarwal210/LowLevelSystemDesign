package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class Panner extends ToppingsDecorator{
    BasePizza pizza;
    public Panner(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+40;
    }

    @Override
    public String pizzaName() {
        return this.pizza.pizzaName()+"+ Panner ";
    }
}
