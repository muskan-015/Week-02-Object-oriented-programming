// Main class 
 class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount bankAccount1 = new BankAccount("123", "Muskan", 1500.0);
        System.out.println("Bank Account Details:");
        bankAccount1.displayAccountDetails();
        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("456", "Nancy", 2000.0, 5.0);
        System.out.println("Savings Account Details:");
        savingsAccount1.displaySavingsAccountDetails();
        System.out.println();

        // Adding interest to the savings account
        savingsAccount1.addInterest();
        System.out.println();

        // Displaying updated savings account details
        savingsAccount1.displaySavingsAccountDetails();
    }
}

//base class
 class BankAccount {
    public String accountNumber;  
    protected String accountHolder; 
    private double balance;        

    // Constructor 
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate; 
    // Constructor 
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); 
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest to the balance
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        setBalance(balance + interest);
        System.out.println("Interest of " + interest + " has been added.");
    }

    // Method to display savings account details (including access to protected members)
    public void displaySavingsAccountDetails() {
        
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

