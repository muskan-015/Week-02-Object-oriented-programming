package encapsulation_and_polymorphism.online_food_delivery_system;

public class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 75.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Additional charge of INR " + NON_VEG_CHARGE + " per item is included.";
    }
}
