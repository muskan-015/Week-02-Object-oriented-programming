package encapsulation_and_polymorphism.vehicle_rental_system;

public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private static final double RATE = 0.02;

    public Bike(String vehicleNumber, double rate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}
