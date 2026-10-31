package practicies;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Basic calc by rectoozzz\nPick a number: ");
            int a = scanner.nextInt();
            
            System.out.print("Pick a another number: ");
            int b = scanner.nextInt();
            
            System.out.println("choose a Operator * | + | - | / | %");
            char Operator = scanner.next().charAt(0);
            
            System.out.println("You choosed: " +Operator);
            
            switch (Operator) {
                case '+' -> {
                    int AddResult = Addition(a, b);
                    System.out.println("Output: " +AddResult);
                }
                case '*' -> {
                    int TimesResult = Times(a, b);
                    System.out.println("Output: " +TimesResult);
                }
                case '-' -> {
                    int MinusResult = Minus(a, b);
                    System.out.println("Output: " +MinusResult);
                }
                case '/' -> {
                    int DivideResult = Divide(a, b);
                    System.out.println("Output: " +DivideResult);
                }
                case '%' -> {
                    int ModuloResult = remainder(a, b);
                    System.out.println("Output: " +ModuloResult);
                }
                default -> {
                    System.out.println("Please enter a valid operator");
                }
            }
        }

    }
    public static int Addition(int a, int b){
        int sum = a + b;
        if(b >= a){
            sum = b + a;
        }
        return sum;
    }

    public static int Times(int a, int b){
        int sum = a * b;
        if(b >= a){
            sum = b * a;
        }
        return sum;
    }

    public static int Minus(int a, int b){
        int sum = a - b;
        if(b >= a){
            sum = b - a;
        }
        return sum;
    }

    public static int Divide(int a, int b){
        int sum = a / b;
        if(b >= a && a % b> 0){
            sum = b /a;
        }
        return sum;
    }
    public static int remainder(int a, int b){
        int sum = a % b;
        if(b > a){
            sum = b % a;
        }
        return sum;
    }
}