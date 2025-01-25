package encapsulation_and_polymorphism.banking_system;

public interface Loanable {
    boolean applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}
