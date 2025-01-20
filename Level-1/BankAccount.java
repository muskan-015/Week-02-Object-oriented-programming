// Main class
class Main {
    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount account1 = new BankAccount("Muskan", 1001, 15000);
        BankAccount account2 = new BankAccount("Nancy", 1002, 13000);
        Main obj= new Main();
        obj.displayAccountDetails();
        // Display account details
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        // Perform transactions
        account1.deposit(2000);
        account1.withdraw(1000);
        System.out.println();

        // Display account details again
        account1.displayAccountDetails();

        // Display total accounts
        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());
    }
}

class BankAccount {
    static String bankName = "BOB";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; 
        this.balance = initialBalance;
        totalAccounts++; // Increment total accounts
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("The object is not an instance of BankAccount.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

