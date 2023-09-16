package PizzaFactoryDesignPattern;

public class ChicagoMacroniPizza extends Pizza{
    public ChicagoMacroniPizza(){
        name="ChicagoMacroni Pizza";
        toppings.add("cheese macroni");
        toppings.add("red sauce");
    }

    @Override
    public void cut() {
        System.out.println("Cutting your pizza in squares...");
    }
}
