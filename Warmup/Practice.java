package Warmup;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            System.out.println("Insert how many amount");
            int amount = scanner.nextInt();
            
            int[] array = new int[amount];
            
            
            
            
            for(int i = 0 ; i < amount ; i++){
                System.out.print("insert grade: ");
                array[i] = scanner.nextInt();
                
                sum += array[i];
                
                
            }
            
            int highest = array[0];
            int lowest = array[0];
            for (int k = 1; k < array.length; k++) {
                if (array[k] < lowest) {
                    lowest = array[k];
                }
                if (array[k] > highest) {
                    highest = array[k];
                }
            }
            System.out.println("Your average: "+(sum/amount));
            System.out.println("Highest: "+highest);
            System.out.println("Lowest: "+lowest);
        }
    }
}