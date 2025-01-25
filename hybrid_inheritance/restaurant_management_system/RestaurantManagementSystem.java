package hybrid_inheritance.restaurant_management_system;

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
