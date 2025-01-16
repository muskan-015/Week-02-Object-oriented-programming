class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: INR " + price);
    }

    // Main method 
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Redmi", "Note 10 pro", 24999.00);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 79999.00);

        // Display details
        System.out.println("Phone 1 Details:");
        phone1.showDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.showDetails();
    }
}
