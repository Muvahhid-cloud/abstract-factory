import factorymethod.FactoryDemo;
import abstractfactory.AbstractFactoryDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Demo ===");
        FactoryDemo.run();

        System.out.println("\n=== Abstract Factory Demo ===");
        AbstractFactoryDemo.run();
    }
}
