package AbstractFactoryDesignPattern;
import AbstractFactoryDesignPattern.Factory.VehicleFactory;
import AbstractFactoryDesignPattern.Factory.VehicleFactoryOfFactory;

public class main {
    public static void main(String[] args) {
        VehicleFactoryOfFactory vehicleFactoryOfFactory=new VehicleFactoryOfFactory();

        VehicleFactory ordinaryVehicleFactory=vehicleFactoryOfFactory.getVehicleFactory("Ordinary");
        ordinaryVehicleFactory.getVehicle("Swift").average();
        ordinaryVehicleFactory.getVehicle("Swift").name();

        VehicleFactory ordinaryVehicleFactory2=vehicleFactoryOfFactory.getVehicleFactory("Ordinary");
        ordinaryVehicleFactory2.getVehicle("Alto").average();
        ordinaryVehicleFactory2.getVehicle("Alto").name();

        VehicleFactory luxiorousVehicleFactory=vehicleFactoryOfFactory.getVehicleFactory("Luxirous");
        luxiorousVehicleFactory.getVehicle("BMW").average();
        luxiorousVehicleFactory.getVehicle("BMW").name();

        VehicleFactory luxiorousVehicleFactory2=vehicleFactoryOfFactory.getVehicleFactory("Luxirous");
        luxiorousVehicleFactory2.getVehicle("Mercedes").average();
        luxiorousVehicleFactory2.getVehicle("Mercedes").name();

    }
}
