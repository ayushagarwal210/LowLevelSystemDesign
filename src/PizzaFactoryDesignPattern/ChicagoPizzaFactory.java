package PizzaFactoryDesignPattern;

public class ChicagoPizzaFactory extends PizzaStore{
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese"))
            pizza=new ChicagoCheesePizza();
        else if(type.equals("macroni"))
            pizza=new ChicagoMacroniPizza();
        return pizza;
    }
}
