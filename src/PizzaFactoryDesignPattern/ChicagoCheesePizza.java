package PizzaFactoryDesignPattern;

public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza(){
        name="ChicagoCheese Pizza";
        toppings.add("mozarilla cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting your pizza in squares...");
    }
}
