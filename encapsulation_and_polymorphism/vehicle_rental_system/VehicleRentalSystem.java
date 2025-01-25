package encapsulation_and_polymorphism.vehicle_rental_system;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("123", 150000, "1234");
        vehicles[1] = new Bike("456", 50000, "5678");
        vehicles[2] = new Truck("789", 30000, "1357");

        int rentalDays = 10;
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
        }
    }
}
