package hybrid_inheritance.restaurant_management_system;

public class Waiter extends Person implements Worker {
    String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Serving food and attending customers in " + section + " section.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Section: " + section);
    }
}
