package Practices;

public class array {
    public static void main(String[] args) {
        

        int[][] numbers = {
            {10,10,10,10,10},
            {10,60,90,10,70},
            {90,100,70,20,0}
        };

        int lowest = numbers[0][0];
        int highest = numbers[0][0];

        for (int[] index : numbers) {
            for (int inside : index) {

                if (lowest < inside) {
                    lowest = inside;
                } else if (highest > inside) {
                    highest = inside;
                }
                String zero = (inside % 2 == 0) ? "E-":"O-";
                System.out.print(zero+inside+" ");

            }
            System.out.println();
        }

    }
}
