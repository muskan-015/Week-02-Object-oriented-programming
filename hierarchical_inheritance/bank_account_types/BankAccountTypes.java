package hierarchical_inheritance.bank_account_types;

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
