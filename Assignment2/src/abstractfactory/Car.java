package abstractfactory;

public class Car implements Vehicle {
    private String region;

    public Car(String region) {
        this.region = region;
    }

    @Override
    public void drive() {
        System.out.println(region + " Car driving");
    }
}
