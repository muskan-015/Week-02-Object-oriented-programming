package encapsulation_and_polymorphism.online_food_delivery_system;

public class FoodDeliverySystem {
    public static void main(String[] args) {

        FoodItem vegItem = new VegItem("Matar Paneer", 199.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken", 350.0, 3);

        FoodItem[] order = {vegItem, nonVegItem};
        double totalOrderPrice = 0;

        System.out.println("Order Details:");
        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: " + totalPrice);

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
                double discountedPrice = discountable.applyDiscount(10);
                System.out.println("Discounted Price: " + discountedPrice);
                totalOrderPrice += discountedPrice;
            } else {
                totalOrderPrice += totalPrice;
            }
        }

        System.out.println("Final Order Price (after discounts): " + totalOrderPrice);
    }
}
