package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Vehicle.BMW;
import AbstractFactoryDesignPattern.Vehicle.Mercedes;
import AbstractFactoryDesignPattern.Vehicle.Vehicle;

public class LuxuryVehicle implements VehicleFactory{
    public Vehicle getVehicle(String input){
        switch (input){
            case "Mercedes":
                return new Mercedes();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }
}
