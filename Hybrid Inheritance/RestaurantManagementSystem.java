// Superclass
class Person {
    String name;
    int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    // Abstract method
    void performDuties();
}

// Subclass
class Chef extends Person implements Worker {
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

// Subclass
class Waiter extends Person implements Worker {
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

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Chef chef = new Chef("Harshit", 101, "South Indian Cuisine");
        Waiter waiter = new Waiter("Harsh", 102, "Outdoor Seating");

        // Display details
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        System.out.println("Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}

