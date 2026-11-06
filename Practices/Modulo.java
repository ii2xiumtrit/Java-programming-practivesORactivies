package Practices;
import java.util.Scanner;

public class Modulo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("Fizzbuzz");
        } else if(num % 7 == 0){
            System.out.println("Fizz");
        }


    scanner.close();
    }
}