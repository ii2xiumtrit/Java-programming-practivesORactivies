package Practices;
import java.util.Random;


public class Randomize {
    public static void main(String[] args) {

        Random random = new Random();

        int row = random.nextInt(2,10);
        int column = random.nextInt(2,10);
        int[][] array = new int[row][column];

        for (int i = 0 ; i < row; i++) {
            for (int j = 0 ; j < column; j++) {
                array[i][j] = random.nextInt(1,100);
            }
        }
        
        int evenCounter = 0;
        int oddCounter = 0;
        int highest = array[0][0];
        int lowest = array[0][0];

        for (int[] r : array) {
            int sum = 0;
            for (int value : r) {
                String zero= (value < 10) ? "0":"";
                String even = (value % 2 == 0) ? "-E":"-O";
                if (even.equals("-E")) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }

                if (value > highest) {
                    highest = value;
                } else if (value < lowest) {
                    lowest = value;
                }

                sum += value;
                System.out.print("["+zero+value+"]"+even+" ");
            }
            System.out.println("= "+sum);
        }
        System.out.println("\nEven and odd: "+evenCounter+", "+oddCounter);
        System.out.println("Highest: "+highest);
        System.out.println("Lowest: "+lowest);
    }
}
