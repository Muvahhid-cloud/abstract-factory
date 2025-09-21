package abstractfactory;

public class Bike implements Vehicle {
    private String region;

    public Bike(String region) {
        this.region = region;
    }

    @Override
    public void drive() {
        System.out.println(region + " Bike riding");
    }
}
