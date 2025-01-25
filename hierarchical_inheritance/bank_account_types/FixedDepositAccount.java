package hierarchical_inheritance.bank_account_types;

public class FixedDepositAccount extends BankAccount {
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
