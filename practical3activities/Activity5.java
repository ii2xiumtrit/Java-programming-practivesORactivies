package practical3activities;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== game menu ===");
            System.out.println("1. Game start");
            System.out.println("2. Pause");
            System.out.println("3. Resume");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> System.out.println("Game started!");
                case 2 -> System.out.println("Game paused!");
                case 3 -> System.out.println("Game resume!");
                case 4 -> System.out.println("Game exitted");
                default -> System.out.println("error try again");
            }
        }
    }
}
