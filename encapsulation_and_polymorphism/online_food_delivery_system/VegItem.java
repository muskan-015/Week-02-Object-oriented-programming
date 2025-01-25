package encapsulation_and_polymorphism.online_food_delivery_system;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applicable on total VegItem price.";
    }
}
