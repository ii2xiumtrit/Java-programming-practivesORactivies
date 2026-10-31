package practicies;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Your age?");
            int age = scanner.nextInt();
            
            if(age >= 18){
                System.out.println("adult");
                
            }
            else {
                System.out.println("You are not an adult");
            }
        }
        
    }
}
