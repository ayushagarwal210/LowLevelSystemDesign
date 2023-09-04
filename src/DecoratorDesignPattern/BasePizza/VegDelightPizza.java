package DecoratorDesignPattern.BasePizza;

public class VegDelightPizza extends BasePizza{
    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String pizzaName() {
        return "VegDelight ";
    }
}
