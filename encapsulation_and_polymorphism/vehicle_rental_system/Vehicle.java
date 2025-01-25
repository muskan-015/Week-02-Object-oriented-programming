package encapsulation_and_polymorphism.vehicle_rental_system;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rate;

    public Vehicle(String vehicleNumber, String type, double rate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rate = rate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rate;
    }

    public void setRentalRate(double rate) {
        this.rate = rate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rate);
    }
}
