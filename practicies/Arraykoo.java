package practicies;

import java.util.Scanner;

public class Arraykoo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Marcus", "Gelo", "Symon", "Jah", "Badap", "AJ", "Carps", "Ma'am margie", "Sir, Sulit"};
        int num = names.length;
        System.out.print("Pick any number from 0-"+(num -1)+": ");
        int pickings = scanner.nextInt();
        System.out.println("Pinili mo: "+pickings +" ("+names[pickings]+")");

        scanner.close();
    }
}
