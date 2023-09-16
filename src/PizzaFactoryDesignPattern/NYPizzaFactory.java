package PizzaFactoryDesignPattern;

public class NYPizzaFactory extends PizzaStore{
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese"))
            pizza=new NYCheesePizza();
        else if(type.equals("macroni"))
            pizza=new NYMacroniPizza();
        return pizza;
    }
}
