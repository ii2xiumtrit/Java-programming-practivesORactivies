package week5;

import java.util.Scanner;

public class Day1_A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int greater = 0;
        int lower = 0;
        int equal = 0;

        for (int index = 0; index < numbers.length ; index++) {
            System.out.print("Enter number: ");
            numbers[index] = scanner.nextInt();

            if (numbers[index] > 50) {
                greater++;
            } else if (numbers[index] < 50) {
                lower++;
            } else if (numbers[index] == 50) {
                equal++;
            }
        }
        System.out.println();
        for (int index : numbers) {
            System.out.println(index);
        }

        System.out.println("Greater than 50: "+greater);
        System.out.println("lower than 50: "+lower);
        System.out.println("equal to 50: "+equal);
    }
}
