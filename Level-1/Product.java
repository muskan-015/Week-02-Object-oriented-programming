// Main class
class Main {
    public static void main(String[] args) {
        // Update the discount
        Product.updateDiscount(15.0);
        System.out.println();

        // Create product objects
        Product product1 = new Product(1, "Laptop", 50000, 1);
        Product product2 = new Product(2, "Smartphone", 20000, 2);

        // Display product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        // Update discount again
        System.out.println();
        Product.updateDiscount(20.0);
        System.out.println();

        // Display product details 
        product1.displayProductDetails();
    }
}

class Product {
    // Static variable
    static double discount = 10.0; 

    // Final variable
    private final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor 
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; 
        this.productName = productName;
        this.price = price; 
        this.quantity = quantity;
    }

    // Static method 
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        } else {
            System.out.println("Invalid discount value.");
        }
    }

    // Method to calculate the total price after applying the discount
    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }

    // Method to display product details
    public void displayProductDetails() {
        // Using instanceof to validate the object type
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price after " + discount + "% discount: " + calculateTotalPrice());
        } else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }
}
