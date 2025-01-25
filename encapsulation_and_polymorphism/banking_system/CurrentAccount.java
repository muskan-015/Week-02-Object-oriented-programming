package encapsulation_and_polymorphism.banking_system;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double RATE = 0.04;
    private static final double LOAN_ELIGIBILITY = 0.5;

    public CurrentAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * RATE;
    }

    @Override
    public boolean applyForLoan(double loanAmount) {
        double eligibility = calculateLoanEligibility();
        if (loanAmount <= eligibility) {
            System.out.println("Loan approved for: " + loanAmount);
            return true;
        } else {
            System.out.println("Your Loan amount exceeds eligibility.");
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY;
    }
}
