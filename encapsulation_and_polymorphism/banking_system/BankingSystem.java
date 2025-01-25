package encapsulation_and_polymorphism.banking_system;

public class BankingSystem {public static void main(String[] args) {

    BankAccount savings = new SavingsAccount("1234", "Muskan", 40000);
    BankAccount current = new CurrentAccount("5678", "Nancy", 20000);

    savings.displayDetails();
    System.out.println("Interest: " + savings.calculateInterest());
    savings.deposit(5000);
    savings.withdraw(2000);

    current.displayDetails();
    System.out.println("Interest: " + current.calculateInterest());
    current.deposit(10000);
    current.withdraw(5000);

    if (current instanceof Loanable) {
        Loanable loanable = (Loanable) current;
        double eligibility = loanable.calculateLoanEligibility();
        System.out.println("Loan Eligibility: " + eligibility);
        loanable.applyForLoan(10000);
    }
}
}
