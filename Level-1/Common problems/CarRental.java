public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; 

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double TotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + DAILY_RATE);
        System.out.println("Total Cost: $" + TotalCost());
    }

    // Main method
    public static void main(String[] args) {
        // Using default constructor
        CarRental Rental1 = new CarRental();
        System.out.println("Default Rental Details:");
        Rental1.display();

        System.out.println();

        // Using parameterized constructor
        CarRental Rental2 = new CarRental("Muskan", "Toyota Corolla", 5);
        System.out.println("Parameterized Rental Details:");
        Rental2.display();
    }
}
