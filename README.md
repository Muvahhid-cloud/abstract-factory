📖 Assignment 2 – Factory Method & Abstract Factory (Vehicles)
1. Introduction

This project demonstrates two important Creational Design Patterns in Java:

Factory Method Pattern → creates one product at a time using subclasses.

Abstract Factory Pattern → creates families of related products without specifying their concrete classes.

The chosen domain is Vehicles (Car + Bike), which keeps the implementation simple and easy to explain.

2. Factory Method Pattern
🔹 Concept

Defines an interface for creating objects.

Subclasses decide which class to instantiate.

Promotes loose coupling between client and concrete classes.

🔹 Implementation

Vehicle → interface (common method: drive())

Car and Bike → concrete products

VehicleFactory → factory interface

CarFactory and BikeFactory → concrete factories

FactoryDemo → demonstrates usage

🔹 How it Works

Instead of creating objects directly (new Car() / new Bike()), the client calls the factory.
The factory decides which object to return.

Example Output:

Driving a Car
Riding a Bike


Benefit:

Client code is independent of concrete classes.

Adding a new type (e.g., Truck) only requires a new factory, without modifying client code.

3. Abstract Factory Pattern
🔹 Concept

Provides an interface for creating families of related objects.

Ensures products from the same family are compatible.

🔹 Implementation

Vehicle → interface

Car and Bike → product classes (with region-specific behavior)

VehicleFactory → abstract factory interface

EuropeFactory and AsiaFactory → concrete factories

AbstractFactoryDemo → demonstrates usage

🔹 How it Works

EuropeFactory → creates EuropeCar and EuropeBike.

AsiaFactory → creates AsiaCar and AsiaBike.

The client switches between product families simply by switching factories.

Example Output:

Europe Car driving
Europe Bike riding
Asia Car driving
Asia Bike riding


Benefit:

Supports multiple product families (e.g., Europe, Asia, America).

Adding a new region only requires a new factory, not changes in the client.

4. Clean Code Principles Applied

Meaningful Names → clear, descriptive classes and methods.

Single Responsibility → each class has one clear purpose (e.g., CarFactory only creates cars).

Open/Closed Principle → open for extension (add new products/factories), closed for modification.

Separation of Concerns → product logic is separate from creation logic.

Readability → small, simple classes with consistent naming.

5. Conclusion

Factory Method → best for creating single products with flexibility.

Abstract Factory → best for creating families of products, ensuring compatibility across types.

This assignment demonstrates how design patterns improve maintainability, extensibility, and code cleanliness.
