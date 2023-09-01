package StrategyDesignPattern.Defination;

import StrategyDesignPattern.Implementation.SportsDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportsDrive());
    }
}
