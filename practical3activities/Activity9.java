package practical3activities;

import java.util.Scanner;

public class Activity9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many numbers/grades: ");
        int list = scanner.nextInt();


        int[] Grade = new int[list];

        
        for (int i = 0 ; i < list ; i++) {
            System.out.println("Enter grade for number " +i+":");
            Grade[i] = scanner.nextInt();
        }

        System.out.println("\nENTERED NUMBERS: ");
        for (int i = 0; i < list ; i++) {
            System.out.println(i+" "+Grade[i]);
        }

        int lowest = Grade[0];
        int highest = Grade[0];

        for (int i = 0; i < list ; i++) {
            if (Grade[i] < lowest) {
                lowest = Grade[i];
            } else if (Grade[i] > highest) {
                highest = Grade[i];
            }

            
        }
        System.out.println("Highest: "+highest);
        System.out.println("Lowest: "+lowest);
    }
}
