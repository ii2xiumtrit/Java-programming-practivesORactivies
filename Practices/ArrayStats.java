package Practices;
import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many numbers do you want to enter? ");
            int size = scanner.nextInt();
            
            double[] numbers = new double[size];
            
            // 1. Collect data using Scanner and store in array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }
            
            // 2. Pass array to a method to process
            double average = calculateAverage(numbers);
            
            System.out.println("The average is: " + average);
        }
    }

    // 3. Reusable method
    public static double calculateAverage(double[] arr) {
        if (arr.length == 0) return 0;
        
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}