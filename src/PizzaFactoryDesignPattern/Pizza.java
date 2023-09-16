package PizzaFactoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    List<String> toppings=new ArrayList<>();
    public void prepare(){
        System.out.println("Pizza is preparing... "+name);
    }
    public void bake(){
        for(String topping:toppings){
            System.out.println("Adding toppings.. " + topping);
        }
        System.out.println("Pizza is baking...");
    }
    public void cut(){
        System.out.println("Cutting diagonal slices...");
    }
    public void box(){
        System.out.println("Boxing your pizza...");
    }
}
