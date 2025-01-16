class Main{
    public static void main(String[] args) {
        Item item = new Item("1", "Notebook", 70.0);

        // Display item details
        item.display();

        // Calculate total cost
        int quantity = 5;
        double totalCost = item.TotalCost(quantity);
        System.out.println("Total cost for " + quantity + " " + item.itemName + "(s): " + totalCost);
    }
}
class Item {
    private String itemCode;
    String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    public double TotalCost(int quantity) {
        return price * quantity;
    }
}