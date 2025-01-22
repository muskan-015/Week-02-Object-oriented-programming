import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        // Create a Bank
        Bank bank = new Bank("SBI");

        // Create Customers
        Customer customer1 = new Customer("Muskan");
        Customer customer2 = new Customer("Nancy");

        // Create Accounts for Customers
        Account account1 = new Account(1, 5000);
        Account account2 = new Account(2, 8000);
        Account account3 = new Account(3, 12000);

        // Add accounts to customers
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account3);

        // Open accounts in the bank
        bank.openAccount(customer1);
        bank.openAccount(customer2);

        // Display customers in the bank
        System.out.println();
        bank.displayCustomers();

        // View balances for a specific customer
        System.out.println();
        customer1.viewBalance();

        // Perform transactions on accounts
        System.out.println();
        account1.deposit(2000);
        account1.withdraw(3000);
        account1.withdraw(10000);
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers; // Association

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer) {
        customers.add(customer); 
        System.out.println("Account opened for " + customer.getName() + " at " + bankName);
    }

    // Method to display all customers of the bank
    public void displayCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts; // Association

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    // Method to add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account with ID " + account.getAccountID() + " added for customer " + name);
    }

    // Method to view the balance of all accounts
    public void viewBalance() {
        System.out.println(name + "'s Account Balances:");
        for (Account account : accounts) {
            System.out.println("Account ID: " + account.getAccountID() + ", Balance: " + account.getBalance());
        }
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Accounts:");
        for (Account account : accounts) {
            System.out.println("  Account ID: " + account.getAccountID() + ", Balance: " + account.getBalance());
        }
    }
}

class Account {
    private int accountID;
    private double balance;

    // Constructor
    public Account(int accountID, double initialBalance) {
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    // Getters
    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountID);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountID);
        } else {
            System.out.println("insufficient balance.");
        }
    }
}

