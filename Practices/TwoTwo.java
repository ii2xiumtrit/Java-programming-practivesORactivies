package Practices;

public class TwoTwo {
    public static void main(String[] args) {
        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 1; j <= 5; j++) {
                int product = j * i;
                String zero = (product < 10) ? "0": "";
                String even = (product % 2 == 0) ? "-E": "-O";
                evenCounter = (product % 2 == 0) ? evenCounter++:oddCounter++;

                sum += product;
                System.out.print(zero+product+even+" ");
            }
            System.out.println("= " +sum);
        }
        System.out.println("Even "+evenCounter);
        System.out.println("odd "+oddCounter);
    }
}
