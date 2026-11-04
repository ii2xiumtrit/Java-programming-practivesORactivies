package practical3activities;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your password: ");
            String password = scanner.next();
            
            int length = password.length();
            
            if (length >= 8 ) {
                System.out.println("\nStrong password.");
            } else {
                System.out.println("\nWeak password.");
            }
        }
    }
}
