package Warmup;

import java.util.Scanner;

public class LoopNswitch {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
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
                    
                    case 1 -> System.out.println("Output: "+ (NumOne+NumTwo));
                    case 2 -> System.out.println("Output: "+ (NumOne-NumTwo));
                    case 3 -> System.out.println("Output: "+ (NumOne*NumTwo));
                    case 4 -> System.out.println("Output: "+ (NumOne/NumTwo));
                    case 5 -> System.out.println("Output: "+ (NumOne%NumTwo));
                    default -> display();
                        
                        
                }
                System.out.println("Run again?: ");
                runAgain = scanner.next();
                
            } while (runAgain.equalsIgnoreCase("yes"));
        }
    }
    public static void display() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
    }
}
