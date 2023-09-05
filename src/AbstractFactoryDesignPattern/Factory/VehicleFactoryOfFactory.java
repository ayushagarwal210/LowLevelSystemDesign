package AbstractFactoryDesignPattern.Factory;


public class VehicleFactoryOfFactory {
    public VehicleFactory getVehicleFactory(String type){
        switch (type){
            case "Luxirous":
                return new LuxuryVehicle();
            case "Ordinary":
                return new OrdinaryVehicle();
            default:
                return null;
        }
    }
}
