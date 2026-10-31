package practicies;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please give me your name :");
            String name = scanner.nextLine();
            System.out.print("age? ");
            int age = scanner.nextInt();
            Birthday(name, age);
        }
    }

    static void Birthday(String name, int age){
        System.out.printf("Happy birthday to you %s\n", name);
        System.out.printf("You are %s years old \n", age);
        System.out.println("Happy birthday.!");
        System.out.println("Happy birthday..!");
        System.out.println("Happy birthday...!");
    }
}
