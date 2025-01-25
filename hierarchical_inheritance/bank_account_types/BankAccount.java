package hierarchical_inheritance.bank_account_types;

public class BankAccount {String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: INR " + balance);
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("General Account");
    }
}