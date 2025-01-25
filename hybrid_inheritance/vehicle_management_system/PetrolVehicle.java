package hybrid_inheritance.vehicle_management_system;

public class PetrolVehicle extends Vehicle implements Refuelable {
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
