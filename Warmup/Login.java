package Warmup;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String name = "marcus";
        String Password = "password123";
        String nameInput = "";
        String passwordInput = "";


        do {
            System.out.println("Enter your name: ");
            nameInput = scanner.nextLine();

            System.out.println("Enter your password: ");
            passwordInput = scanner.nextLine();

            
            if(passwordInput.equals(Password) && nameInput.equals(name)) {
                break;
            } else {
                i++;
                System.out.println("Try again! Attempts: "+i);
            }

        } while (i <= 3 );
        
        scanner.close();
    }
}
