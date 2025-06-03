class Vehicle {
    protected String model;
    protected double fuelEfficiency;
    protected double distanceTraveled;
    protected double maxSpeed;

    public Vehicle(String model, double fuelEfficiency, double distanceTraveled, double maxSpeed) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.distanceTraveled = distanceTraveled;
        this.maxSpeed = maxSpeed;
    }

    public void display(String type) {
        System.out.println(type + " Model: " + model);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " mpg");
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle("Tatra 810 4x4", 8.075659532105526, 65.50975012444003, 80.0);
        Vehicle car = new Vehicle("Virtus", 2.355, 14.419665, 120.0);
        Vehicle motorcycle = new Vehicle("Warrior200", 2.1, 4.41, 80.0);

        truck.display("Truck");
        car.display("Car");
        motorcycle.display("Motorcycle");
    }
}
