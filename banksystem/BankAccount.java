package banksystem;

public class BankAccount {
    // 1. Attributes (Data fields)
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    // 2. Constructor: Initializes the account when a new object is created
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 3. Deposit Method: Adds money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        }
    }

    // 4. Withdraw Method: Removes money from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount!");
        }
    }

    // 5. Display Method: Prints out account details
    public void displayInfo() {
        System.out.println("--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }
}