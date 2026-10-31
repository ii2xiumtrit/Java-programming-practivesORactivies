package practicies;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"apple","orrange","banana", "Onions"};

        int num = fruits.length;

        Arrays.sort(fruits);


        for(int i = 0; i < num ; i++){
            System.out.println(fruits[i]);
        }
        System.out.println(" ");
        System.out.println("for enchanted for loops");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}