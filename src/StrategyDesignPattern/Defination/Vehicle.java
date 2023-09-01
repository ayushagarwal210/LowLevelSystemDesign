package StrategyDesignPattern.Defination;

import StrategyDesignPattern.Implementation.DriveInterface;

public class Vehicle {
    DriveInterface driveObject;
    public Vehicle(DriveInterface driveObj){
        this.driveObject=driveObj;
    }
    public void drive(){
        driveObject.drive();
    }
}
