package StrategyDesignPattern;

import StrategyDesignPattern.Defination.GoodsVehicle;
import StrategyDesignPattern.Defination.SportsVehicle;
import StrategyDesignPattern.Defination.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsCar=new SportsVehicle();
        sportsCar.drive();
        Vehicle goodsCar=new GoodsVehicle();
        goodsCar.drive();
    }
}
