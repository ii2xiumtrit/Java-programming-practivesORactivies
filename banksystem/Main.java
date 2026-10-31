
package banksystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a standard BankAccount object for "Ana"
        BankAccount basic = new BankAccount("1001", "Ana", 5000.0);
        SavingsAccount savings = new SavingsAccount("2001", "Ben", 10000.0, 2.5);
        Scanner scanner = new Scanner(System.in);

        // basic.displayInfo();
        // basic.deposit(1000.0);
        // basic.displayInfo();
        // Creating a SavingsAccount object for "Ben"
        // savings.displayInfo(); // Show savings account details including interest rate

        System.out.println("Who's bank account: "+ basic.accountHolder +" or "+ savings.accountHolder);
        String Picked = scanner.nextLine();

        if (Picked.equals(basic.accountHolder)) {
            basic.displayInfo();
        } else if (Picked.equals(savings.accountHolder)) {
            savings.displayInfo();
        } else {
            System.out.println("Insert a real name provided above");
        }

        scanner.close();
    }
}