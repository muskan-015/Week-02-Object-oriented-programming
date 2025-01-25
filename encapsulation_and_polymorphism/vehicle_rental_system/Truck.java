package encapsulation_and_polymorphism.vehicle_rental_system;

public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private static final double RATE = 0.01;

    public Truck(String vehicleNumber, double rate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rate);
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
