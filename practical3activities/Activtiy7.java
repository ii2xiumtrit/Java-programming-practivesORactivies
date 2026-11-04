package practical3activities;

import java.util.Scanner;

public class Activtiy7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your number");
            int number = scanner.nextInt();
            
            System.out.println("Odd numbers: ");
            
            for (int i = 1 ; i <= number ; i++) {
                if (i % 2 == 0) {
                    
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
