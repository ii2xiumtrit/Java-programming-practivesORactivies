package Warmup;

public class Decipher {
    public static void main(String[] args) {
        int[] asciiValues = {
    72, 101, 108, 108, 111, 44, 32, 74, 97, 118, 97, 32, 87, 111, 114, 108, 100, 33
};

    String message = "";
    for (int i = 0 ; i < asciiValues.length ; i++) {
        char letters = (char) asciiValues[i];
        message = message + letters;

    }

    System.out.println(message);
    }
}
