package banksystem;

public class SavingsAccount extends BankAccount {
    // Extra attribute unique to savings accounts
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        // 'super' calls the constructor of the parent class (BankAccount)
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    // Overriding displayInfo to also show the interest rate
    @Override
    public void displayInfo() {
        super.displayInfo(); // Prints the basic info from BankAccount
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("---------------------------");
    }
}