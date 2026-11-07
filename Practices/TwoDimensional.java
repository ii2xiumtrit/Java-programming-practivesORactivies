package Practices;

public class TwoDimensional {
    public static void main(String[] args) {
        
        int[] scores = {80,90,100,50,100};
        int lowest = scores[0];
        int highest = scores[0];

        for (int data : scores) {
            if (data < lowest) {
                lowest = data;
            } else if (data > highest) {
                highest = data;
            }
        }
        System.out.println(highest+", "+lowest);
    }
}
