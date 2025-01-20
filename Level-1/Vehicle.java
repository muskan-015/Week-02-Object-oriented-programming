// Main class
class Main {
    public static void main(String[] args) {
        // Display default registration fee
        System.out.println("Default Registration Fee: " + Vehicle.registrationFee);
        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println();

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Muskan", "Car", "Car123");
        Vehicle vehicle2 = new Vehicle("Nancy", "scooter", "Scooty123");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}

class Vehicle {
    // Static variable
    static double registrationFee = 5000.0;

    // Final variable 
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName; 
        this.vehicleType = vehicleType; 
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: " + registrationFee);
        } else {
            System.out.println("Invalid registration fee.");
        }
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("The object is not an instance of the Vehicle class.");
        }
    }
}

