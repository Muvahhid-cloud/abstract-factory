package abstractfactory;

public class EuropeFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new Car("Europe");
    }

    @Override
    public Bike createBike() {
        return new Bike("Europe");
    }
}
