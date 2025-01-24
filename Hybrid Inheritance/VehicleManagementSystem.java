// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    // Abstract method
    void refuel();
}

// Subclass
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle: " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass
class PetrolVehicle extends Vehicle implements Refuelable {
    double fuelTankCapacity;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle ");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        //electricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model ", 250, 100);

        // Create a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Toyota", 180, 50.0);

        // Display details
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        System.out.println();

        // Display details
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}

