package Nestforloop;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many row? ");
        int row = scanner.nextInt();

        System.out.print("How many column? ");
        int column = scanner.nextInt();

        int evenCounter = 0;
        int oddCounter = 0;

        for(int i = 1; i <= row ; i++) {
            
            int sum = 0;
            
            for (int j = 1; j<= column;j++) {
                
            
                String zero = "";
                int product = j * i;
                String even = "";
                
                if (product < 10) {
                    zero = "0";
                }
                if (product % 2 == 0) {
                    even = "-E";
                    evenCounter++;
                } else {
                    even = "-O";
                    oddCounter++;
                }
                sum += product;
                System.out.print(zero+product+even+" ");
            }
            System.out.println("= "+sum);
        
        }
        scanner.close();
        System.out.println("Odd: "+oddCounter);
        System.out.println("Even: "+evenCounter);
    }
}