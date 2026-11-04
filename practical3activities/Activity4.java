package practical3activities;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your consumption: ");
            int consumption = scanner.nextInt();

            if (consumption > 0 && consumption < 100){
                System.out.println("Usage category: Low Consumption");
            } else if ( consumption > 101 && consumption < 300) {
                System.out.println("Usage category: Moderate Consumption");
            } else if ( consumption > 300) {
                System.out.println("Usage category: High Consumption");
            }
        }
    }
}
