package practical3activities;

import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = 0;

        System.out.println("=== TEMPERATURE CONVERTER ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int Choice = scanner.nextInt();

        switch (Choice) {
            case 1:
                System.out.print("Enter celcius: ");
                b = scanner.nextDouble();
                System.out.println("Fahrenheit: "+((b*9/5)+32) );
                break;
            case 2:
                System.out.print("Enter fahreinheit: ");
                b = scanner.nextDouble();
                System.out.println("Fahrenheit: "+((b - 32) * 5 / 9) );
                break;
            default:
                throw new AssertionError();
        }
    }
}
