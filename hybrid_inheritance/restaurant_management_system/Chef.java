package hybrid_inheritance.restaurant_management_system;

public class Chef extends Person implements Worker {
    String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing meals specializing in " + specialty + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}
