package Construction;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String answer = "";
            double amount = 0;
            
            System.out.print("Your bank: ");
            String a = scanner.nextLine();
            
            System.out.print("Your name: ");
            String b = scanner.nextLine();
            
            System.out.print("Initial balance  ");
            double c = scanner.nextInt();
            scanner.nextLine();
            
            Bank bankOne = new Bank(a, b, c);
            boolean hasAmount = bankOne.initialBalance > 0;
            
            System.out.println("Register completed \nWhat now? DEPOSIT | WITHDRAW | DISPLAY");
            answer = scanner.nextLine();
            
            if(answer.equals("withdraw") || answer.equals("Withdraw")) {
                System.out.print("How much..?: ");
                amount = scanner.nextDouble();
                System.out.println("Processing...");
                if (amount > 0) {
                    System.out.println("New balance: "+(bankOne.Withdraw(amount)));
                } else{
                    System.out.println("Something went wrong...");
                }
            } else if(answer.equals("deposit") || answer.equals("Deposit")){
                System.out.print("How much..?: ");
                amount = scanner.nextDouble();
                if (amount > 0) {
                    System.out.println("New balance: "+(bankOne.Deposit(amount)));
                }   else{
                    System.out.println("Something went wrong...");
                }
            } else if(answer.equals("display") || answer.equals("Display")) {
                bankOne.Display();
            }
        }
    }
}
