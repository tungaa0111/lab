class Vehicle {
    protected String brand;
    protected double fuel; // Шинэ атрибут

    public Vehicle(String brand) {
        this.brand = brand;
        this.fuel = 0.0; // Default fuel
    }

    public void refuel(double amount) {
        fuel += amount;
        System.out.println(brand + " refueled: " + amount + "L. Total fuel: " + fuel + "L");
    }

    public void displayInfo() {
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Fuel: " + fuel + "L");
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car doors: " + numDoors);
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, double loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck load capacity: " + loadCapacity + " tons");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Truck truck = new Truck("Volvo", 18.5);

        car.refuel(20);
        truck.refuel(100);

        System.out.println();
        car.displayInfo();
        System.out.println();
        truck.displayInfo();
    }
}

