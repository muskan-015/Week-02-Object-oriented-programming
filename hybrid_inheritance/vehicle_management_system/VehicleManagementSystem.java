package hybrid_inheritance.vehicle_management_system;

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
