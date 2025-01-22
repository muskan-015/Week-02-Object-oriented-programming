import java.util.ArrayList;
import java.util.List;
// Main Class
public class GroceryStore {
    public static void main(String[] args) {
        // Create customer
        Customer customer = new Customer("Muskan", "muskan@gmail.com");

        // Create products
        Product product1 = new Product("P01", "Milk", 34.0);
        Product product2 = new Product("P02", "Bread", 30.0);
        Product product3 = new Product("P03", "Jam", 15.0);

        // Place orders
        customer.placeOrder(product1);
        customer.placeOrder(product2);
        customer.placeOrder(product3);

        // Generate bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.computeTotal(customer);
    }
}

// Customer Class
class Customer {
    private String name;
    private String email;
    private List<Product> products;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.products = new ArrayList<>();
    }

    public void placeOrder(Product product) {
        products.add(product);
        System.out.println("Product added to order: " + product.getProductName());
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Product Class
class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void getDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price);
    }
}

// BillGenerator Class
class BillGenerator {
    public void computeTotal(Customer customer) {
        List<Product> products = customer.getProducts();
        double total = 0;

        System.out.println("Generating bill for customer: " + customer.getName());
        System.out.println("Products purchased:");

        for (Product product : products) {
            product.getDetails();
            total += product.getPrice();
        }

        System.out.println("Total Amount: " + total);
    }
}
