public class Vehicle {
    private String ownerName;
    private String vehicleType; 
    private static double registrationFee = 500.0; 

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Main method
    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Muskan", "Scooter");
        Vehicle vehicle2 = new Vehicle("Nancy", "Bike");
        Vehicle vehicle3 = new Vehicle("Khushi", "Car");

        // Displaying details of each vehicle
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 3 Details:");
        vehicle3.displayVehicleDetails();
        System.out.println();

        // Updating registration fee
        Vehicle.updateRegistrationFee(600.0);

        System.out.println();

        // Displaying details again after updating registration fee
        System.out.println("Updated Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Updated Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        System.out.println("Updated Vehicle 3 Details:");
        vehicle3.displayVehicleDetails();
    }
}
