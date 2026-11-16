package week6;

import java.util.Scanner;

class Nihao {
    int length;
    int[] ages;
}


public class OOP {
    
    public static void main(String[] args) {
        
        Nihao nihao1 = new Nihao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        nihao1.length = scanner.nextInt();

        nihao1.ages = new int[nihao1.length];

        for (int index = 0; index < nihao1.length ;index++ ) {
            System.out.print("Enter number: ");
            nihao1.ages[index] = scanner.nextInt();
        }
        Return(nihao1.ages);
    }

    public static void Return(int[] a) {
        int sum = 0;
        for (int index : a ) {
            System.out.println(index);
            sum += index;
        }
        System.out.println("\nSum: "+sum);
    }
}
