package Practices;

import java.util.Scanner;

public class ArraySelection {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many rows: ");
        int rowSelection = scanner.nextInt();

        System.out.print("Enter how many column: ");
        int columnSelection = scanner.nextInt();

        for(int row = 1; row <= rowSelection; row++) {
            for (int column = 1 ; column <= columnSelection; column++) {
                int product = row*column;
                String zero = (product < 10) ? "0":"";

                System.out.print(zero+product+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
