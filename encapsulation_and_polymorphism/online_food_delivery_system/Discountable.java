package encapsulation_and_polymorphism.online_food_delivery_system;

public interface Discountable {
    double applyDiscount(double discountPercentage);

    String getDiscountDetails();
}
