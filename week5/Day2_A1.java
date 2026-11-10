package week5;

import java.util.Scanner;

public class Day2_A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;
        for(int index : array) {
            System.out.print("Enter grade for student ");
            index = scanner.nextInt();

            sum += index;
        }

        System.out.println("\nTotal: "+sum);
        System.out.println("Average: "+(sum/array.length));
    }
}
