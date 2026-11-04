package practical3activities;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int Number = scanner.nextInt();
            if (Number <= 100 && Number > 0) {
                System.out.println("Within range");
            } else {
                System.out.println("Not within range");
            }
        }
    }
}
