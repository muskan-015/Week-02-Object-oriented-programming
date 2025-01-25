package encapsulation_and_polymorphism.e_commerce_platform;

public class Clothing extends Product implements Taxable {
    private static final double RATE = 0.10;
    private double discountAmount;

    public Clothing(int id, String name, double price, double discountAmount) {
        super(id, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
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
