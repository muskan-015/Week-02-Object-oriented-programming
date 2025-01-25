package encapsulation_and_polymorphism.banking_system;

public class SavingsAccount extends BankAccount {
    private static final double RATE = 0.05;

    public SavingsAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * RATE;
    }
}
