package practicies;

public class LowerNlowst {
    public static void main(String[] args) {
        int[] numbers = {75, 60, 5, 10, 70, 80, 90, 100};
        int Lowest = numbers[0];
        int high = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] < Lowest) {
                Lowest = numbers[i];
            } else if (numbers[i] > high) {
                high = numbers[i];
            }

        }
        System.out.println(Lowest);
        System.out.println(high);

        
    }
}
