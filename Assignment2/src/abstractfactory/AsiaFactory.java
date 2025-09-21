package abstractfactory;

public class AsiaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new Car("Asia");
    }

    @Override
    public Bike createBike() {
        return new Bike("Asia");
    }
}
