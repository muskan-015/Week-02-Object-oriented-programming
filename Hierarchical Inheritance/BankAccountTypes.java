// Base class
class BankAccount {
    String accountNumber;
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

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: INR " + withdrawalLimit);
    }
}

// Subclass
class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println(" Fixed Deposit Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

// Main class
public class BankAccountTypes {
    public static void main(String[] args) {
        // Create different types of bank accounts
        SavingsAccount savingsAccount = new SavingsAccount("123", 5000.0, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("456", 2000.0, 1000.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("789", 10000.0, 12);

        // Display details of each account
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();
        System.out.println();

        System.out.println("Checking Account Details:");
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();
        System.out.println();

        System.out.println("Fixed Deposit Account Details:");
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}

