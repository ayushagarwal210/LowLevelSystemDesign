package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+50;
    }

    @Override
    public String pizzaName() {
        return this.pizza.pizzaName()+"+ ExtraCheese ";
    }
}
