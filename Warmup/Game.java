package Warmup;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int answer;
        int i = 0;
        boolean run = false;
        int numberOne = rand.nextInt(100);
        int numberTwo = rand.nextInt(100);
        
        System.out.println("choose a operator: + | - | * | /");
        char operator = scan.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("CALCULATE: "+numberOne+"+"+numberTwo);
                sum = numberOne + numberTwo;
                run = true;
                break;
            case '-':
                System.out.println("CALCULATE: "+numberOne+"-"+numberTwo);
                sum = numberOne - numberTwo;
                run = true;
                break;
            case '*':
                System.out.println("CALCULATE: "+numberOne+"*"+numberTwo);
                sum = numberOne * numberTwo;
                run = true;
                break;

            case '/':
                System.out.println("CALCULATE: "+numberOne+"/"+numberTwo);
                sum = numberOne / numberTwo;
                run = true;
                break;
            default:
                throw new AssertionError();
        }

        
        do {
            answer = scan.nextInt();
            if(answer == sum) {
                System.out.println("You are correct!");
                break;
            } else {
                i++;
                System.out.println("Try again. Tries: " +"["+i+"]");
            }

            if(i == 3){
                System.out.println("3/3 tries. Re-run it again");
                break;
            } else {

            }
            
            
        } while (run);
    }

    public void display() {

    }
}