package encapsulation_and_polymorphism.e_commerce_platform;

public class Electronics extends Product implements Taxable {
    private static final double RATE = 0.15;
    private double discountRate;

    public Electronics(int id, String name, double price, double discountRate) {
        super(id, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (RATE * 100) + "%";
    }
}
