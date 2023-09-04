package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizza.BasePizza;
import DecoratorDesignPattern.BasePizza.FarmHousePizza;
import DecoratorDesignPattern.BasePizza.VegDelightPizza;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.Panner;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new Panner(new VegDelightPizza());
        System.out.println(pizza.pizzaName());
        System.out.println(pizza.cost());

        BasePizza pizza2=new Panner(new ExtraCheese(new Panner(new FarmHousePizza())));
        System.out.println(pizza2.pizzaName());
        System.out.println(pizza2.cost());
    }
}
