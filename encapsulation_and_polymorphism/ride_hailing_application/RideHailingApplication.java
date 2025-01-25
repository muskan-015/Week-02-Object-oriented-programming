package encapsulation_and_polymorphism.ride_hailing_application;

public class RideHailingApplication {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("123", "Muskan", 15.0, "Sonagiri");
        Vehicle bike = new Bike("456", "Nancy", 10.0, "New Market");
        Vehicle auto = new Auto("789", "Harsh", 12.0, "Station");

        // Process rides
        Vehicle[] rides = {car, bike, auto};
        double[] distances = {10.0, 5.5, 8.0};

        System.out.println("Ride Details:");
        for (int i = 0; i < rides.length; i++) {
            Vehicle vehicle = rides[i];
            vehicle.getVehicleDetails();
            double fare = vehicle.calculateFare(distances[i]);
            System.out.println("Fare for " + distances[i] + " km: " + fare);

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location " + (i + 1));
            }
        }
    }
}
