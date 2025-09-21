package abstractfactory;

public class AbstractFactoryDemo {
    public static void run() {
        VehicleFactory europeFactory = new EuropeFactory();
        Vehicle europeCar = europeFactory.createCar();
        Vehicle europeBike = europeFactory.createBike();

        europeCar.drive();
        europeBike.drive();

        VehicleFactory asiaFactory = new AsiaFactory();
        Vehicle asiaCar = asiaFactory.createCar();
        Vehicle asiaBike = asiaFactory.createBike();

        asiaCar.drive();
        asiaBike.drive();
    }
}
