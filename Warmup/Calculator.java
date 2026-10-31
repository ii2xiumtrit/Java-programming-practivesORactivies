package Warmup;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean again = !false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number one: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Number two: ");
        double numberTwo = scanner.nextDouble();

        System.out.print("Choose operator + | - | * | / | %: ");
        char operator = scanner.next().charAt(0);


        switch (operator) {
            case '+':
                System.out.println("result: "+(numberOne+numberTwo));
                break;
            case '-':
                System.out.println("result: "+(numberOne-numberTwo));
                break;
            case '*':
                System.out.println("result: "+(numberOne*numberTwo));
                break;
            case '/':
                System.out.println("result: "+(numberOne/numberTwo));
                break;
            case '%':
                System.out.println("result: "+(numberOne%numberTwo));
                    
                break;
            default:
                again = true;
                System.out.println("Error.. try again");
        }
    }
}
