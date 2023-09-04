package DecoratorDesignPattern.BasePizza;

public class FarmHousePizza extends BasePizza{
    @Override
    public int cost(){
        return 100;
    }

    @Override
    public String pizzaName() {
        return "FarmHouse ";
    }
}
