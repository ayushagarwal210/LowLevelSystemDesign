package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Vehicle.Alto;
import AbstractFactoryDesignPattern.Vehicle.Swift;
import AbstractFactoryDesignPattern.Vehicle.Vehicle;
import FactoryDesignPattern.Implementation.Circle;
import FactoryDesignPattern.Implementation.Square;
import FactoryDesignPattern.Shape;

public class OrdinaryVehicle implements VehicleFactory{
    public Vehicle getVehicle(String input){
        switch (input){
            case "Alto":
                return new Alto();
            case "Swift":
                return new Swift();
            default:
                return null;
        }
    }
}
