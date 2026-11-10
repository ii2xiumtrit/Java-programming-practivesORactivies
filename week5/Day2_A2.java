package week5;

import java.util.Scanner;

public class Day2_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] array = new int[5];

        int highest = array[0];
        int lowest = array[0];
        for (int index = 0; index < array.length; index++) {
            System.out.print("Number "+(index+1)+": ");
            array[index] = scanner.nextInt();

            if (array[index] > highest) {
                highest = array[index];
            } else {
                lowest = array[index];
            }
        }
        System.out.println("Highest: "+highest);
        System.out.println("Lowest: "+lowest);
    }
}

