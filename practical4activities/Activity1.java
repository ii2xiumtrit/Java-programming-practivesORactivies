package practical4activities;
// package practical4activities;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age 1");
        int age = scanner.nextInt();
        if (age < 12) {
            System.out.println("Age group: Child");
        } else if (age > 13 && age < 19) {
            System.out.println("Age group: Teenager");
        } else if (age > 20 && age < 59) {
            System.out.println("Age group: adult");
        } else if (age > 60) {
            System.out.println("Age group: Senior citizen");
        }
        scanner.close();
    }
}
