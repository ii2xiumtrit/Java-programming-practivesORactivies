package Warmup;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Number one: ");
            double numberOne = scanner.nextDouble();
            
            System.out.print("Number two: ");
            double numberTwo = scanner.nextDouble();
            
            System.out.print("Choose operator + | - | * | / | %: ");
            char operator = scanner.next().charAt(0);
            
            
            switch (operator) {
                case '+' -> System.out.println("result: "+(numberOne+numberTwo));
                case '-' -> System.out.println("result: "+(numberOne-numberTwo));
                case '*' -> System.out.println("result: "+(numberOne*numberTwo));
                case '/' -> System.out.println("result: "+(numberOne/numberTwo));
                case '%' -> System.out.println("result: "+(numberOne%numberTwo));
                default -> System.out.println("Error.. try again");
            }
        }
    }
}
