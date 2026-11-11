package week5;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many value in a array? ");
        int length = scanner.nextInt();
        int[] arrays = new int[length];
        
        for (int index = 0; index < arrays.length ; index++) {
            System.out.print("Enter number for "+(index+1)+" ");
            arrays[index] = scanner.nextInt();
            
        }

        System.out.println();
        int sum = 0;
        int evenCounter = 0;
        int oddCounter = 0;

        for (int index : arrays) {
            String even = (index % 2 == 0) ? "-E":"-O";
            if (index % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            System.out.println(index+even);

            sum += index;
        }
        System.out.println("\nSum "+sum);
        System.out.println("E: "+evenCounter+", O: "+oddCounter);



    }
}
