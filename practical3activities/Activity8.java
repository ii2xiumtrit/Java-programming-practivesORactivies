package practical3activities;

import java.util.Scanner;

public class Activity8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int fac = scanner.nextInt();
            
            int sum = 1;
            
            for (int i = fac ; i > 0 ; i--) {
                
                sum = i * sum;
                System.out.println(i+" "+sum);
            }
        }
    }
}
