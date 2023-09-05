package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Vehicle.Vehicle;

public interface VehicleFactory {
    public Vehicle getVehicle(String car);
}
