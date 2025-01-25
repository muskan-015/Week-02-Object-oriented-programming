package encapsulation_and_polymorphism.e_commerce_platform;

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list of products
        Product[] products = new Product[3];

        // Add products to the list
        products[0] = new Electronics(1, "Laptop", 80000, 10);
        products[1] = new Clothing(2, "Top", 1500, 500);
        products[2] = new Groceries(3, "Pulses", 200, 5);

        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
        }
    }
}
