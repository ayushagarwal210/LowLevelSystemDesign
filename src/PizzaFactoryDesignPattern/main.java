package PizzaFactoryDesignPattern;

public class main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore=new NYPizzaFactory();
        PizzaStore chPizzaStore=new ChicagoPizzaFactory();
        nyPizzaStore.orderPizza("cheese");
        System.out.println();
        chPizzaStore.orderPizza("macroni");
    }
}
