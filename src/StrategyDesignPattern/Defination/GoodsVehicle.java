package StrategyDesignPattern.Defination;

import StrategyDesignPattern.Implementation.NormalDrive;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDrive());
    }
}
