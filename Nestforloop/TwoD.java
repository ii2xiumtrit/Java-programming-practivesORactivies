package Nestforloop;

public class TwoD {
        public static void main(String[] args) {

            int[] RowOne = {90,60,70,65,100};
            int[] RowTwo = {10,80,99,10,67};
            int[] RowThree = {5, 10, 70, 99, 67};
            int[][] numbers = {RowOne, RowTwo, RowThree};
            int lowest = numbers[0][0];
            int highest = numbers[0][0];
            for (int[] num : numbers) {
                for (int nums : num) {
                    System.out.print(nums + " ");
                    
                    if (nums <  lowest) {
                        lowest = nums;
                    } else if (nums > highest) {
                        highest = nums;
                    }
                }
                System.out.println();
            }
            System.out.println("Highest: "+highest);
            System.out.println("Lowest: "+lowest);
        }
}
