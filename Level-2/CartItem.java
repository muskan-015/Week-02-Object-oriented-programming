class CartManager {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Laptop", 50000.0, 1);
        cart.addItem("mobile phone", 30000.0, 1);

        // Display total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem();

        // Display total cost after removal
        cart.displayTotalCost();
    }
}
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get total cost of this item
    public double TotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    
    CartItem item;
    double totalCost;

    // Method to add an item 
    public void addItem(String itemName, double price, int quantity) {
        item = new CartItem(itemName, price, quantity);
        totalCost += item.TotalCost();
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item
    public void removeItem() {
        if (item != null) {
            System.out.println("Removed " + item.itemName + " from the cart.");
            totalCost -= item.TotalCost();
            item = null;
        } else {
            System.out.println("No item to remove.");
        }
    }

    // Method to display total cost
    public void displayTotalCost() {
        System.out.println("Total cost of items in the cart: INR " + totalCost);
    }
}


