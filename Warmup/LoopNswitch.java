package Warmup;

import java.util.Scanner;

public class LoopNswitch {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        String runAgain;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("Pick a operator: ");
            int Operator = scanner.nextInt();
            System.out.println("Number one: ");
            int NumOne = scanner.nextInt();
            System.out.println("Number Two: ");
            int NumTwo = scanner.nextInt();

            switch (Operator) {

                case 1:
                    System.out.println("Output: "+ (NumOne+NumTwo));
                    run = false;
                    break;
                case 2:
                    System.out.println("Output: "+ (NumOne-NumTwo));
                    run = false;
                    break;
                case 3:
                    System.out.println("Output: "+ (NumOne*NumTwo));
                    run = false;
                    break;
                case 4:
                    System.out.println("Output: "+ (NumOne/NumTwo));
                    run = false;
                    break;
                case 5:
                    System.out.println("Output: "+ (NumOne%NumTwo));
                    run = false;
                    break;
                default:
                    display();

                
            }
            System.out.println("Run again?: ");
            runAgain = scanner.next();

        } while (runAgain.equalsIgnoreCase("yes"));
        scanner.close();
    }
    public static void display() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
    }
}
