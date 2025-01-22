import java.util.ArrayList;
// Main Class
class Main {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Muskan");
        Customer customer2 = new Customer("Nancy");

        // Create products
        Product product1 = new Product("Laptop", 61000);
        Product product2 = new Product("Smartphone", 3800);
        Product product3 = new Product("Headphones", 1150);
        Product product4 = new Product("Smartwatch", 2200);

        // Create orders for customers
        Order order1 = new Order(1, customer1);
        Order order2 = new Order(1, customer2);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product3);

        order2.addProduct(product2);
        order2.addProduct(product4);

        // Customers place orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Display customer orders
        System.out.println();
        customer1.displayCustomerOrders();
        System.out.println();
        customer2.displayCustomerOrders();
    }
}

// Product Class
class Product {
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("  - Product: " + productName + ", Price: $" + price);
    }
}

// Order Class
class Order {
    int orderID;
    private Customer customer; // Association
    private ArrayList<Product> products; // Aggregation

    // Constructor
    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product: " + product.getProductName() + " to Order ID: " + orderID);
    }

    // Method to calculate the total cost of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in the Order:");
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println("Total Cost: $" + calculateTotal());
    }
}

// Customer Class
class Customer {
    private String name;
    private ArrayList<Order> orders; // Association

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with Order ID: " + order.orderID);
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Method to display all orders placed by the customer
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name + "'s Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

