package encapsulation_and_polymorphism.e_commerce_platform;

public class Groceries extends Product {
    private double discountRate;

    public Groceries(int id, String name, double price, double discountRate) {
        super(id, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }
}
